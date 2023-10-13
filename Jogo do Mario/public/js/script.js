const mario = document.querySelector('.mario');
const pipe = document.querySelector('.pipe');
const clouds = document.querySelector('.clouds');
const game_over = document.querySelector('#game_over');


const jump = () => {
    mario.classList.add('jump');

    setTimeout(() => {

        mario.classList.remove('jump');

    }, 500);
}

const loop = setInterval(() => {

    const pipePosition = pipe.offsetLeft;
    const cloudsPosition = clouds.offsetRight;
    const marioPosition = window.getComputedStyle(mario).bottom.replace('px', '');
    
    
    if (pipePosition <= 120 && pipePosition > 0 && marioPosition < 80) {
        
        pipe.style.animation = 'none';
        pipe.style.left = `${pipePosition}px`;

        mario.style.animation = 'none';
        mario.style.bottom = `${marioPosition}px`;
        
        mario.src = 'aseets/imgs/game-over.png';
        mario.style.width = '75px';
        mario.style.marginLeft = '50px';
        
        clouds.style.animation = 'none';
        clouds.style.right = `${cloudsPosition}px`;

        game_over.innerHTML = `Game over`
        
        clearInterval(loop);
    }
    
}, 10)

document.addEventListener('keydown', jump);