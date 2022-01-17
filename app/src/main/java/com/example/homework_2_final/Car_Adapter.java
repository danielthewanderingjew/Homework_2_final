package com.example.homework_2_final;


import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Car_Adapter extends RecyclerView.Adapter<Car_View_Holder> {

    private List<Car> cars;
    public Car_Adapter(List<Car> cars)
    {
        this.cars = cars;
    }

    public void AddContact(Car car)
    {
        cars.add(car);
        notifyDataSetChanged();
        Data_Persistence_Helper.StoreData(cars);
    }

    public void DeleteContact(int position)
    {
        cars.remove(position);
        notifyDataSetChanged();
        Data_Persistence_Helper.StoreData(cars);
    }
    @NonNull
    @Override
    public Car_View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.carlist,parent,false);
        Car_View_Holder vh = new Car_View_Holder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Car_View_Holder holder, int position) {
        Car car = cars.get(position);

        holder.closeup.setImageResource(car.getImage());
        holder.brand.setText(car.getBrand());
        holder.model.setText(car.getModel());
        holder.year.setText(car.getYear());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity2.class);
                i.putExtra("user", car);
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) v.getContext(),
                                holder.closeup,
                                "photoTransition"
                        );
                v.getContext().startActivity(i,options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
