package com.davidinnocent.ajs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.davidinnocent.ajs.databinding.FragmentLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginFragment extends Fragment {

    FragmentLoginBinding binding;
    NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding=FragmentLoginBinding.inflate(inflater,container,false);
        navController= Navigation.findNavController(container);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(LoginFragmentDirections.actionLoginFragmentToSignUpFragment());
            }
        });

        binding.sin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             FirebaseAuth.getInstance().signInWithEmailAndPassword(binding.editTextTextEmailAddress.getText().toString(),binding.editTextTextPassword.getText().toString())
                     .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                         @Override
                         public void onComplete(@NonNull Task<AuthResult> task) {
                             if(task.isSuccessful())
                             {

                                navController.navigate(LoginFragmentDirections.actionLoginFragmentToRoleFragment());

                             return;
                             }
                             Toast.makeText(getContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();

                         }
                     });
         }
     });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}