package iut.tower_defence.data.character.monster;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class MMelee extends Monster {

    public MMelee(int m_Life, int m_Defense, int m_Attack, int m_Speed, int m_Range , int m_SpeedAttack, boolean m_isDead) {
        super(m_Life, m_Defense, m_Attack, m_Speed, 1, m_SpeedAttack, m_isDead);
    } //MMelee
}
