package com.example.myapplication.ui.contextmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentContextBinding;

public class ContextMenuFragment extends Fragment {

private FragmentContextBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        ContextMenuViewModel contextMenuViewModel =
                new ViewModelProvider(this).get(ContextMenuViewModel.class);

    binding = FragmentContextBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textContext;
        contextMenuViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        final CardView cardView = binding.contextMenuDemo;
        registerForContextMenu(cardView);

        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}