package com.nerazocharovalsya.stooo.ui.applications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.nerazocharovalsya.stooo.databinding.FragmentApplicationsBinding;

public class ApplicationsFragment extends Fragment {

    private ApplicationsViewModel applicationsViewModel;
    private FragmentApplicationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        applicationsViewModel =
                new ViewModelProvider(this).get(ApplicationsViewModel.class);

        binding = FragmentApplicationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textApplications;
        applicationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}