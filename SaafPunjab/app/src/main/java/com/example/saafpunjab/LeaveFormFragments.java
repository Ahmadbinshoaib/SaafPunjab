package com.example.saafpunjab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LeaveFormFragments extends FragmentStateAdapter {
    public LeaveFormFragments(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position==0) {
            return new leaveFormSelf();
        }
        return new leaveFormWorker();

    }


    @Override
    public int getItemCount() {
        return 2;
    }
}
