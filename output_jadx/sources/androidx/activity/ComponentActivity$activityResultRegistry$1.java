package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\t2\u0006\u0010\n\u001a\u0002H\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$activityResultRegistry$1", "Landroidx/activity/result/ActivityResultRegistry;", "onLaunch", "", "I", "O", "requestCode", "", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ComponentActivity$activityResultRegistry$1 extends ActivityResultRegistry {
    final /* synthetic */ ComponentActivity this$0;

    public ComponentActivity$activityResultRegistry$1(ComponentActivity componentActivity) {
        this.this$0 = componentActivity;
    }

    public static /* synthetic */ void b(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, IntentSender.SendIntentException sendIntentException) {
        onLaunch$lambda$1(componentActivity$activityResultRegistry$1, i10, sendIntentException);
    }

    public static /* synthetic */ void c(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, ActivityResultContract.SynchronousResult synchronousResult) {
        onLaunch$lambda$0(componentActivity$activityResultRegistry$1, i10, synchronousResult);
    }

    public static final void onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, ActivityResultContract.SynchronousResult synchronousResult) {
        componentActivity$activityResultRegistry$1.dispatchResult(i10, synchronousResult.getValue());
    }

    public static final void onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, IntentSender.SendIntentException sendIntentException) {
        componentActivity$activityResultRegistry$1.dispatchResult(i10, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public <I, O> void onLaunch(int requestCode, ActivityResultContract<I, O> contract, I input, ActivityOptionsCompat options) {
        Bundle bundle;
        int i10;
        contract.getClass();
        ComponentActivity componentActivity = this.this$0;
        ActivityResultContract.SynchronousResult<O> synchronousResult = contract.getSynchronousResult(componentActivity, input);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new f(this, requestCode, synchronousResult, 0));
            return;
        }
        Intent createIntent = contract.createIntent(componentActivity, input);
        if (createIntent.getExtras() != null) {
            Bundle extras = createIntent.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (createIntent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
            bundle = createIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            createIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
        } else if (options != null) {
            bundle = options.toBundle();
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (Intrinsics.areEqual(ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS, createIntent.getAction())) {
            String[] stringArrayExtra = createIntent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, requestCode);
            return;
        }
        if (Intrinsics.areEqual(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST, createIntent.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
            try {
                intentSenderRequest.getClass();
                i10 = requestCode;
                try {
                    ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i10, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    new Handler(Looper.getMainLooper()).post(new f(this, i10, e, 1));
                }
            } catch (IntentSender.SendIntentException e6) {
                e = e6;
                i10 = requestCode;
            }
        } else {
            ActivityCompat.startActivityForResult(componentActivity, createIntent, requestCode, bundle2);
        }
    }
}
