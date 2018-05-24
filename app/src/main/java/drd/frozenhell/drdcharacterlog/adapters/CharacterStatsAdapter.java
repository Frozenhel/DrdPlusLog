package drd.frozenhell.drdcharacterlog.adapters;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import drd.frozenhell.drdcharacterlog.R;
import drd.frozenhell.drdcharacterlog.entities.CharacterStats;

public class CharacterStatsAdapter extends RecyclerView.Adapter<CharacterStatsAdapter.CharacterStatsViewHolder> {
    private CharacterStats stats;

    public CharacterStatsAdapter(CharacterStats stats){
        this.stats = stats;
    }

    @NonNull
    @Override
    public CharacterStatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.character_stats_row,parent,false);
        return new CharacterStatsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterStatsViewHolder holder, int position) {
        int imageResource;
        int value;
        String name;
        int modifier;

        switch (position){
            default:
                imageResource = R.drawable.ic_character_stat_skill;
                value = 10;
                name = "default";
                modifier = 10;
        }

        holder.onBind(imageResource,value,name,modifier);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class CharacterStatsViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView valueTextView;
        private TextView nameTextView;
        private TextView modifierTextView;

        public CharacterStatsViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.statRowImageView);
            valueTextView = itemView.findViewById(R.id.statRowValueTextView);
            nameTextView = itemView.findViewById(R.id.statRowNameTextView);
            modifierTextView = itemView.findViewById(R.id.statRowModifierTextView);
        }

        void onBind(int imageResource, int value, String name, int modifier){
            imageView.setImageResource(imageResource);
            valueTextView.setText(value);
            nameTextView.setText(name);
            modifierTextView.setText(modifier);
        }
    }
}
