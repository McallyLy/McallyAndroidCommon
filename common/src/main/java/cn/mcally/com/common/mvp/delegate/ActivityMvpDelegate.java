package cn.mcally.com.common.mvp.delegate;

import android.app.Activity;
import android.os.Bundle;

import cn.mcally.com.common.mvp.root.IMvpPresenter;
import cn.mcally.com.common.mvp.root.IMvpView;

/**
 * Activity生命周期
 *
 * @param <V>
 * @param <P>
 */
public interface ActivityMvpDelegate<V extends IMvpView, P extends IMvpPresenter<V>> {

    /**
     * This method must be called from {@link Activity#onCreate(Bundle)}.
     * This method internally creates the presenter and attaches the view to it.
     */
    void onCreate(Bundle bundle);

    /**
     * This method must be called from {@link Activity#onDestroy()}}.
     * This method internally detaches the view from presenter
     */
    void onDestroy();

    /**
     * This method must be called from {@link Activity#onPause()}
     */
    void onPause();

    /**
     * This method must be called from {@link Activity#onResume()}
     */
    void onResume();

    /**
     * This method must be called from {@link Activity#onStart()}
     */
    void onStart();

    /**
     * This method must be called from {@link Activity#onStop()}
     */
    void onStop();

    /**
     * This method must be called from {@link Activity#onRestart()}
     */
    void onRestart();

    /**
     * This method must be called from {@link Activity#onContentChanged()}
     */
    void onContentChanged();

    /**
     * This method must be called from {@link Activity#onSaveInstanceState(Bundle)}
     */
    void onSaveInstanceState(Bundle outState);

    /**
     * This method must be called from {@link Activity#onPostCreate(Bundle)}
     */
    void onPostCreate(Bundle savedInstanceState);

}
