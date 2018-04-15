// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.au.vimalprakash.letspay.di.modules;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class SupportModules_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final SupportModules module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public SupportModules_ProvideRetrofitFactory(
      SupportModules module,
      Provider<Gson> gsonProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(gsonProvider.get(), okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      SupportModules module,
      Provider<Gson> gsonProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new SupportModules_ProvideRetrofitFactory(module, gsonProvider, okHttpClientProvider);
  }
}
