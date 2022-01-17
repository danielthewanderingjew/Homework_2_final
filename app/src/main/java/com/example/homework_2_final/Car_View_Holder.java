package com.example.homework_2_final;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Car_View_Holder extends RecyclerView.ViewHolder {
    public CardView card;
    public ImageView closeup;
    public TextView brand;
    public TextView model;
    public TextView year;

    public Car_View_Holder(@NonNull View itemView) {
        super(itemView);

        card = itemView.findViewById(R.id.card);
        closeup = itemView.findViewById(R.id.closeup);
        brand = itemView.findViewById(R.id.brand);
        model = itemView.findViewById(R.id.model);
        year = itemView.findViewById(R.id.year);
    }
}
