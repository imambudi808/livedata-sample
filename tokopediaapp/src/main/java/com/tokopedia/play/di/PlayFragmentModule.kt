package com.tokopedia.play.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.tokopedia.play.di.key.FragmentKey
import com.tokopedia.play.view.fragment.PlayFragment
import com.tokopedia.play.view.fragment.PlayInteractionFragment
import com.tokopedia.play.view.fragment.PlayVideoFragment
import com.tokopedia.play.view.fragment.factory.PlayFragmentFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class PlayFragmentModule {

    @Binds
    abstract fun bindFragmentFactory(fragmentFactory: PlayFragmentFactory): FragmentFactory

    @Binds
    @IntoMap
    @FragmentKey(PlayFragment::class)
    abstract fun getPlayFragment(fragment: PlayFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(PlayVideoFragment::class)
    abstract fun getPlayVideoFragment(fragment: PlayVideoFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(PlayInteractionFragment::class)
    abstract fun getPlayInteractionFragment(fragment: PlayInteractionFragment): Fragment
}