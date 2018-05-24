package drd.frozenhell.drdcharacterlog.entities;

import drd.frozenhell.drdcharacterlog.enums.CharacterClass;
import drd.frozenhell.drdcharacterlog.enums.CharacterRace;

public class Character {
    private String name;
    private CharacterClass characterClass;
    private CharacterRace race;

    private CharacterStats stats;

    public Character(){
        stats = new CharacterStats();
    }

    public void setStats(CharacterStats stats) {
        this.stats = stats;
    }

    public CharacterStats getStats() {
        return stats;
    }
}
