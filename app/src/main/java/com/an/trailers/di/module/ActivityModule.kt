package com.an.trailers.di.module

import com.an.trailers.ui.detail.activity.MovieDetailActivity
import com.an.trailers.ui.detail.activity.TvDetailActivity
import com.an.trailers.ui.main.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeMovieDetailActivity(): MovieDetailActivity

    @ContributesAndroidInjector
    abstract fun contributeTvDetailActivity(): TvDetailActivity

}