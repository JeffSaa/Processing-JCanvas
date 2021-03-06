Ball ball;

void setup(){
  fullScreen();
  int r = int(random(200)), x = int(random(width-r)), y = int(random(height-r)), v = int(random(10, 40));
  ball = new Ball(x, y, r, v);
}

void draw(){
  background(51);
  ball.move();
  ellipse(ball.x, ball.y, ball.rad, ball.rad);
}

class Ball{
  
  int x, y, rad, vel;
  boolean v_status = true, h_status = true;
  
  Ball(int _x, int _y, int _rad, int _vel){
    x = _x;
    y = _y;
    rad = _rad;
    vel = _vel;
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