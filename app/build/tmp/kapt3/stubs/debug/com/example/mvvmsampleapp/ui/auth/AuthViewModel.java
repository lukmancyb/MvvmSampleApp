package com.example.mvvmsampleapp.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0012H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/mvvmsampleapp/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/mvvmsampleapp/data/repositories/UserRepository;", "(Lcom/example/mvvmsampleapp/data/repositories/UserRepository;)V", "authListener", "Lcom/example/mvvmsampleapp/ui/auth/AuthListener;", "getAuthListener", "()Lcom/example/mvvmsampleapp/ui/auth/AuthListener;", "setAuthListener", "(Lcom/example/mvvmsampleapp/ui/auth/AuthListener;)V", "authResonse", "Lcom/example/mvvmsampleapp/data/network/responses/AuthResponse;", "getAuthResonse", "()Lcom/example/mvvmsampleapp/data/network/responses/AuthResponse;", "setAuthResonse", "(Lcom/example/mvvmsampleapp/data/network/responses/AuthResponse;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "name", "getName", "setName", "password", "getPassword", "setPassword", "password2", "getPassword2", "setPassword2", "getLoggedUser", "Landroidx/lifecycle/LiveData;", "Lcom/example/mvvmsampleapp/data/db/entities/User;", "goToSignUp", "", "v", "Landroid/view/View;", "onLoginButtonClicked", "onSignUpButtonClicked", "request", "str", "Companion", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password2;
    @org.jetbrains.annotations.Nullable()
    private com.example.mvvmsampleapp.ui.auth.AuthListener authListener;
    @org.jetbrains.annotations.Nullable()
    private com.example.mvvmsampleapp.data.network.responses.AuthResponse authResonse;
    private final com.example.mvvmsampleapp.data.repositories.UserRepository repository = null;
    private static final java.lang.String LOGIN_ACTION = "login";
    private static final java.lang.String SIGNUP_ACTION = "signup";
    public static final com.example.mvvmsampleapp.ui.auth.AuthViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword2() {
        return null;
    }
    
    public final void setPassword2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mvvmsampleapp.ui.auth.AuthListener getAuthListener() {
        return null;
    }
    
    public final void setAuthListener(@org.jetbrains.annotations.Nullable()
    com.example.mvvmsampleapp.ui.auth.AuthListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mvvmsampleapp.data.network.responses.AuthResponse getAuthResonse() {
        return null;
    }
    
    public final void setAuthResonse(@org.jetbrains.annotations.Nullable()
    com.example.mvvmsampleapp.data.network.responses.AuthResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mvvmsampleapp.data.db.entities.User> getLoggedUser() {
        return null;
    }
    
    public final void onLoginButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void onSignUpButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void goToSignUp(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void request(java.lang.String str) {
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mvvmsampleapp.data.repositories.UserRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mvvmsampleapp/ui/auth/AuthViewModel$Companion;", "", "()V", "LOGIN_ACTION", "", "SIGNUP_ACTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}