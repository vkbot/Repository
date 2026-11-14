package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {
    private static final String TAG = "FragmentManager";
    final FragmentManager mFragmentManager;

    public FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        int i10;
        final FragmentStateManager createOrGetFragmentStateManager;
        int i11;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.mFragmentManager);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R.styleable.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(R.styleable.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !FragmentFactory.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i10 = view.getId();
        } else {
            i10 = 0;
        }
        if (i10 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.mFragmentManager.findFragmentById(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.mFragmentManager.findFragmentByTag(string);
        }
        if (fragment == null && i10 != -1) {
            fragment = this.mFragmentManager.findFragmentById(i10);
        }
        if (fragment == null) {
            fragment = this.mFragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            if (resourceId != 0) {
                i11 = resourceId;
            } else {
                i11 = i10;
            }
            fragment.mFragmentId = i11;
            fragment.mContainerId = i10;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.mFragmentManager;
            fragment.mFragmentManager = fragmentManager;
            fragment.mHost = fragmentManager.getHost();
            fragment.onInflate(this.mFragmentManager.getHost().getContext(), attributeSet, fragment.mSavedFragmentState);
            createOrGetFragmentStateManager = this.mFragmentManager.addFragment(fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentManager fragmentManager2 = this.mFragmentManager;
            fragment.mFragmentManager = fragmentManager2;
            fragment.mHost = fragmentManager2.getHost();
            fragment.onInflate(this.mFragmentManager.getHost().getContext(), attributeSet, fragment.mSavedFragmentState);
            createOrGetFragmentStateManager = this.mFragmentManager.createOrGetFragmentStateManager(fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i10) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.onFragmentTagUsage(fragment, viewGroup);
        fragment.mContainer = viewGroup;
        createOrGetFragmentStateManager.moveToExpectedState();
        createOrGetFragmentStateManager.ensureInflatedView();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                    Fragment fragment2 = createOrGetFragmentStateManager.getFragment();
                    createOrGetFragmentStateManager.moveToExpectedState();
                    SpecialEffectsController.getOrCreateController((ViewGroup) fragment2.mView.getParent(), FragmentLayoutInflaterFactory.this.mFragmentManager).forceCompleteAllOperations();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                }
            });
            return fragment.mView;
        }
        j1.i.l(ai.onnxruntime.a.m("Fragment ", attributeValue, " did not create a view."));
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
