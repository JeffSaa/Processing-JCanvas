package bouncing_ball;

/**
 *
 * @author JeffSaa
 */
public class Ball {
    
  int x, y, rad, vel, width, height;
  boolean v_status = true, h_status = true;
  
  Ball(int _x, int _y, int _rad, int _vel, int _width, int _height){
    x = _x;
    y = _y;
    rad = _rad;
    vel = _vel;
    width = _width;
    height = _height;
  }
  
  void move(){
    if (h_status)
      move_aux_h(x + rad, width);
    else
      move_aux_h(0, x - rad);
    if (v_status)
      move_aux_v(y + rad, height);
    else
      move_aux_v(0, y - rad);
  }
  
  void move_aux_h(int cond_l, int cond_r){
    int signe = cond_l == 0 ? -1 : 1;
    if(cond_l < cond_r)
      x += vel * signe;
    else
      h_status = !h_status;
  }
  
  void move_aux_v(int cond_l, int cond_r){
    int signe = cond_l == 0 ? -1 : 1;
    if(cond_l < cond_r)
      y += vel * signe;
    else
      v_status = !v_status;
  }
    
}
