package com.google.android.tvlauncher.home;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ProgramState
{
  public static final int DEFAULT = 0;
  public static final int DEFAULT_SELECTED = 1;
  public static final int ZOOMED_OUT = 2;
}


/* Location:              ~/Downloads/fugu-opr2.170623.027-factory-d4be396e/fugu-opr2.170623.027/image-fugu-opr2.170623.027/TVLauncher/TVLauncher/TVLauncher-dex2jar.jar!/com/google/android/tvlauncher/home/ProgramState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */