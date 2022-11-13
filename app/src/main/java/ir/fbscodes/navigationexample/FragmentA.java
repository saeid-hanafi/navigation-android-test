package ir.fbscodes.navigationexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FragmentA extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Button fragmentB = view.findViewById(R.id.fragmentB_btn);
        Button fragmentC = view.findViewById(R.id.fragmentC_btn);
        fragmentB.setOnClickListener(v -> {
            Navigation.findNavController(v)
                    .navigate(R.id.action_fragmentA_to_fragmentB);
        });

        fragmentC.setOnClickListener(v -> {
            Navigation.findNavController(v)
                    .navigate(R.id.action_fragmentA_to_fragmentC);
        });
        return view;
    }
}
