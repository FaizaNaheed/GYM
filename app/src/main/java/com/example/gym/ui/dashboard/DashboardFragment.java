package com.example.gym.ui.dashboard;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gym.MaleFemale;
import com.example.gym.R;
import com.example.gym.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        TextView  textViewname = root.findViewById(R.id.name);
        TextView tvbmi = root.findViewById(R.id.bmi);
        TextView tvtarget = root.findViewById(R.id.target);
        CardView calculateBMI=root.findViewById(R.id.calBMI);

String sname,sbmi,starget;
        // to get saved data
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("FitnessZone", MODE_PRIVATE);
        sname = sharedPreferences.getString("name", "datanotfound");
        sbmi = sharedPreferences.getString("bmi","dnf");
        starget = sharedPreferences.getString("calories","dnf");
        textViewname.setText(sname);
        tvbmi.setText(sbmi);
        tvtarget.setText(starget);

        return root;
    }
    public void onclick(View view)
    {
        Intent intent = new Intent(getActivity(), MaleFemale.class);
        startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}