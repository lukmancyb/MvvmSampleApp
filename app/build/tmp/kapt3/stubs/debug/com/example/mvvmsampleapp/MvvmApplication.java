package com.example.mvvmsampleapp;

import java.lang.System;

@android.annotation.SuppressLint(value = {"Registered"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/mvvmsampleapp/MvvmApplication;", "Landroid/app/Application;", "Lorg/kodein/di/KodeinAware;", "()V", "kodein", "Lorg/kodein/di/LazyKodein;", "getKodein", "()Lorg/kodein/di/LazyKodein;", "app_debug"})
public final class MvvmApplication extends android.app.Application implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final org.kodein.di.LazyKodein kodein = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.LazyKodein getKodein() {
        return null;
    }
    
    public MvvmApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}