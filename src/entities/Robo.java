package entities;

public class Robo extends RoboIdeia {
	
	private static final int FRENTE = 0;
	private static final int ATRAS = 0;
	private static final int ESQUERDA = 0;
	private static final int DIREITA = 0;

	@Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY) ||
            Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Args não válidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }
    
    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Arg não válido");
        }
        super.posicaoX += dist;
    }
    
    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Arg não válido");
        }
        super.posicaoY += dist;
    }
    
    public void setOrientacao(char tecla) {
        if (tecla == 'w') {
            super.orientacao = FRENTE;
            moveY(5);
        } else if (tecla == 's') {
            super.orientacao = ATRAS;
            moveY(-5);
        } else if (tecla == 'a') {
            super.orientacao = ESQUERDA;
            moveX(-5);
        } else if (tecla == 'd') {
            super.orientacao = DIREITA;
            moveX(5);
        } else {
            throw new IllegalArgumentException("Arg não válido");
        }
    }

	public void printPos() {
		// TODO Auto-generated method stub
		
	}

	

}
