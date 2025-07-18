// Generated by Dagger (https://dagger.dev).
package com.codewithkael.firebasevideocall.utils;

import com.google.firebase.database.FirebaseDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideDataBaseInstanceFactory implements Factory<FirebaseDatabase> {
  private final AppModule module;

  public AppModule_ProvideDataBaseInstanceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public FirebaseDatabase get() {
    return provideDataBaseInstance(module);
  }

  public static AppModule_ProvideDataBaseInstanceFactory create(AppModule module) {
    return new AppModule_ProvideDataBaseInstanceFactory(module);
  }

  public static FirebaseDatabase provideDataBaseInstance(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDataBaseInstance());
  }
}
