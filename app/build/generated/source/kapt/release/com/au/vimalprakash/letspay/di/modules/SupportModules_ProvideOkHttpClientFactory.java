// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.vimalprakash.letspay.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

public final class SupportModules_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final SupportModules module;

  private final Provider<Cache> cacheProvider;

  public SupportModules_ProvideOkHttpClientFactory(
      SupportModules module, Provider<Cache> cacheProvider) {
    assert module != null;
    this.module = module;
    assert cacheProvider != null;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(cacheProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(SupportModules module, Provider<Cache> cacheProvider) {
    return new SupportModules_ProvideOkHttpClientFactory(module, cacheProvider);
  }
}
