package com.example.android.scala

import android.app.{Activity, Fragment}
import android.os.Bundle
import android.view.{LayoutInflater, ViewGroup}

class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    if (savedInstanceState == null) {
      getFragmentManager
        .beginTransaction
        .add(R.id.container, new PlaceholderFragment)
        .commit
    }
  }

  class PlaceholderFragment extends Fragment {
    override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle) =
      inflater.inflate(R.layout.fragment_main, container, false)
  }
}
