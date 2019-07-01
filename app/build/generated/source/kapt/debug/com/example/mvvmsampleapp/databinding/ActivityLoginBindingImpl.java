package com.example.mvvmsampleapp.databinding;
import com.example.mvvmsampleapp.R;
import com.example.mvvmsampleapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_view_logo, 5);
        sViewsWithIds.put(R.id.linearLayout1, 6);
        sViewsWithIds.put(R.id.linearLayout2, 7);
        sViewsWithIds.put(R.id.progress_bar, 8);
    }
    // views
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewmodelOnLoginButtonClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewmodelGoToSignUpAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.email
            //         is viewmodel.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.email
            java.lang.String viewmodelEmail = null;
            // viewmodel
            com.example.mvvmsampleapp.ui.auth.AuthViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {




                viewmodel.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.password
            //         is viewmodel.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel
            com.example.mvvmsampleapp.ui.auth.AuthViewModel viewmodel = mViewmodel;
            // viewmodel.password
            java.lang.String viewmodelPassword = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {




                viewmodel.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ProgressBar) bindings[8]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            );
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.rootLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.mvvmsampleapp.ui.auth.AuthViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.mvvmsampleapp.ui.auth.AuthViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewmodelEmail = null;
        java.lang.String viewmodelPassword = null;
        android.view.View.OnClickListener viewmodelOnLoginButtonClickedAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewmodelGoToSignUpAndroidViewViewOnClickListener = null;
        com.example.mvvmsampleapp.ui.auth.AuthViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.email
                    viewmodelEmail = viewmodel.getEmail();
                    // read viewmodel.password
                    viewmodelPassword = viewmodel.getPassword();
                    // read viewmodel::onLoginButtonClicked
                    viewmodelOnLoginButtonClickedAndroidViewViewOnClickListener = (((mViewmodelOnLoginButtonClickedAndroidViewViewOnClickListener == null) ? (mViewmodelOnLoginButtonClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewmodelOnLoginButtonClickedAndroidViewViewOnClickListener).setValue(viewmodel));
                    // read viewmodel::goToSignUp
                    viewmodelGoToSignUpAndroidViewViewOnClickListener = (((mViewmodelGoToSignUpAndroidViewViewOnClickListener == null) ? (mViewmodelGoToSignUpAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewmodelGoToSignUpAndroidViewViewOnClickListener).setValue(viewmodel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelPassword);
            this.mboundView3.setOnClickListener(viewmodelOnLoginButtonClickedAndroidViewViewOnClickListener);
            this.mboundView4.setOnClickListener(viewmodelGoToSignUpAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.mvvmsampleapp.ui.auth.AuthViewModel value;
        public OnClickListenerImpl setValue(com.example.mvvmsampleapp.ui.auth.AuthViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLoginButtonClicked(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.mvvmsampleapp.ui.auth.AuthViewModel value;
        public OnClickListenerImpl1 setValue(com.example.mvvmsampleapp.ui.auth.AuthViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.goToSignUp(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}