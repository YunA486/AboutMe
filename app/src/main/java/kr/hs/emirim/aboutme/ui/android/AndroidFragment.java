package kr.hs.emirim.aboutme.ui.android;

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

import kr.hs.emirim.aboutme.R;

public class AndroidFragment extends Fragment {

    private AndroidViewModel androidViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        androidViewModel =
                new ViewModelProvider(this).get(AndroidViewModel.class);
        View root = inflater.inflate(R.layout.fragment_android, container, false);
        final TextView textView = root.findViewById(R.id.text_android);
        androidViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}