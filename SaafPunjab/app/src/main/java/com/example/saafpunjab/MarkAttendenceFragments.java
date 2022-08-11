package com.example.saafpunjab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MarkAttendenceFragments extends FragmentStateAdapter {
    public MarkAttendenceFragments(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position==0) {
            return new markAttendenceSelf();
        }
        return new markAttendenceWorker();

    }


    @Override
    public int getItemCount() {
        return 2;
    }
}
