package com.example.myapplication.ui.popupmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentPopupBinding;

public class PopUpFragment extends Fragment {

    private FragmentPopupBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PopUpViewModel popUpViewModel =
                new ViewModelProvider(this).get(PopUpViewModel.class);

        binding = FragmentPopupBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPopup;
        popUpViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        final TextView textView1 = binding.popupMenuDemoText;
        textView1.setOnClickListener(view -> {
            // Create and inflate the popup menu
            PopupMenu popupMenu = new PopupMenu(requireContext(), view);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

            // Handle menu item clicks
            popupMenu.setOnMenuItemClickListener(menuItem -> {
                int id = menuItem.getItemId();
                if (id == R.id.nutzeraendern) {
                    // Action for "Nutzer ändern"
                    Toast.makeText(requireContext(), "Nutzer ändern selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.nutzerentfernen) {
                    // Action for "Nutzer entfernen"
                    Toast.makeText(requireContext(), "Nutzer entfernen selected", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            });


            // Show the popup menu
            popupMenu.show();
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
