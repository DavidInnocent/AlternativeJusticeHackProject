package com.davidinnocent.ajs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davidinnocent.ajs.databinding.FragmentRoleBinding;

public class RoleFragment extends Fragment {

    public static final String CITIZEN="citizen";
    public static final String LAWYER="lawyer";
    public static final String ADMIN="admin";

    FragmentRoleBinding binding;
    NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentRoleBinding.inflate(inflater,container,false);
        navController= Navigation.findNavController(container);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navController.navigate(RoleFragmentDirections.actionRoleFragmentToCasesHomeFragment(ADMIN));

            }
        });
        binding.lawyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navController.navigate(RoleFragmentDirections.actionRoleFragmentToCasesHomeFragment(LAWYER));

            }
        });
        binding.citizen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navController.navigate(RoleFragmentDirections.actionRoleFragmentToCasesHomeFragment(CITIZEN));
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}