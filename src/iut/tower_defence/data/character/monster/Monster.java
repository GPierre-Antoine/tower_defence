package iut.tower_defence.data.character.monster;

import iut.tower_defence.data.character.Character;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Monster extends Character {
    private int m_Life;
    private int m_Defense;
    private int m_Attack;
    private int m_Speed;
    private int m_SpeedAttack;
    private int m_Range;
    private boolean m_isDead;

    public Monster(int m_Life, int m_Defense, int m_Attack, int m_Speed, int m_Range, int m_SpeedAttack, boolean m_isDead) {
        this.m_Life = m_Life;
        this.m_Defense = m_Defense;
        this.m_Attack = m_Attack;
        this.m_Speed = m_Speed;
        this.m_Range = m_Range;
        this.m_SpeedAttack = m_SpeedAttack;
        this.m_isDead = m_isDead;
    } //Monster
}
