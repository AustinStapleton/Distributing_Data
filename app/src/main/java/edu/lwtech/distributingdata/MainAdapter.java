package edu.lwtech.distributingdata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel,MainAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {
        holder.name.setText(model.getName());
        holder.type.setText(model.getType());
        holder.rank.setText(model.getRank());
 //       holder.description.setText(model.getDescription());

        Glide.with(holder.img.getContext())
                .load(model.getTurl())
                .placeholder(R.drawable.ic_launcher_background)
                .circleCrop()
                .error(R.drawable.ic_launcher_foreground)
                .into(holder.img);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        CircleImageView img;
        TextView name, type, rank, description;

        public myViewHolder(@NonNull View itemView){
            super(itemView);

            img = (CircleImageView)itemView.findViewById(R.id.img1);
            name = (TextView)itemView.findViewById(R.id.nametext);
            type = (TextView)itemView.findViewById(R.id.type);
            rank = (TextView)itemView.findViewById(R.id.rank);

        }
    }

}
