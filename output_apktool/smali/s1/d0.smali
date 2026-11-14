.class public final synthetic Ls1/d0;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ls1/q0;


# direct methods
.method public synthetic constructor <init>(Ls1/q0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls1/d0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Ls1/d0;->c:Ls1/q0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget v0, p0, Ls1/d0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls1/d0;->c:Ls1/q0;

    .line 7
    .line 8
    iget-boolean v1, v0, Ls1/q0;->s:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ls1/q0;->m()V

    .line 13
    .line 14
    .line 15
    :cond_0
    check-cast p1, Ls1/l0;

    .line 16
    .line 17
    iget-object p1, p1, Ls1/l0;->b:Ls1/j0;

    .line 18
    .line 19
    iget-object p1, p1, Ls1/j0;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, v0, Ls1/q0;->v:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ls1/q0;->A()V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :pswitch_0
    iget-object p1, p0, Ls1/d0;->c:Ls1/q0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ls1/q0;->m()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
