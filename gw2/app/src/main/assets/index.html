<!DOCTYPE html>
<html lang="ru"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1,viewport-fit=cover">
<title>Graphwar II — кривая по скриншоту</title>
<style>
:root{--bg:#0f1116;--pn:#171a22;--ln:#2a2f3a;--fg:#e8eaf0;--mu:#8b93a7;--ac:#4cc9f0;--ok:#3ddc97;--wa:#f5a623;--fit:#ff5c7a}
*{box-sizing:border-box}
html,body{overscroll-behavior:none}
:root{color-scheme:dark;padding-top:env(safe-area-inset-top,0px);padding-bottom:env(safe-area-inset-bottom,0px)}
html{scroll-padding-top:env(safe-area-inset-top,0px)}
body{margin:0;background:var(--bg);color:var(--fg);font:13px system-ui,"Segoe UI",sans-serif;padding:10px;display:flex;justify-content:center}
.w{width:100%;max-width:1400px;background:var(--pn);border:1px solid var(--ln);border-radius:10px;overflow:hidden}
.r{display:flex;flex-wrap:wrap;gap:6px 12px;align-items:center;padding:8px 12px;border-bottom:1px solid var(--ln)}
label{color:var(--mu);font-size:12px}
select,button,input{font:inherit;font-size:12px;color:var(--fg);background:#1e2431;border:1px solid var(--ln);border-radius:6px;padding:5px 8px}
input[type=number]{width:62px}input[type=range]{padding:0;width:110px}
button{cursor:pointer}button.p{background:#20364a;border-color:#2f5d80;font-weight:600}
button.on{background:#2d4a3a;border-color:var(--ok);color:var(--ok)}
.cv{padding:6px;background:#0a0c10;overflow:auto}
canvas{user-select:none;-webkit-user-select:none;-webkit-touch-callout:none;-webkit-tap-highlight-color:transparent;display:block;margin:0 auto;max-width:100%;height:auto;cursor:crosshair;touch-action:none;user-select:none;-webkit-user-select:none;-webkit-touch-callout:none;-webkit-tap-highlight-color:transparent}
.b{font:11px ui-monospace,monospace;padding:3px 8px;border-radius:5px;border:1px solid var(--wa);color:var(--wa)}
.b.ok{border-color:var(--ok);color:var(--ok)}
#eq{padding:10px 14px;border-top:1px solid var(--ln);background:#12161e;font:13.5px ui-monospace,Consolas,monospace}
#eqv{color:var(--fit);white-space:pre-wrap;word-break:break-word;display:block;margin:6px 0}
#st{padding:6px 12px;color:var(--mu);border-top:1px solid var(--ln);display:flex;gap:14px;flex-wrap:wrap}
@media(pointer:coarse){select,button,input{font-size:15px;padding:9px 11px}input[type=number]{width:70px}body{padding:4px}.r{gap:8px 10px}}
#st .co{margin-left:auto;font-family:ui-monospace,monospace}

body.gw{padding:0;display:block;background:#000;overflow:hidden}
body.gw .w{max-width:none;width:100vw;height:100vh;border:0;border-radius:0;position:relative;overflow:hidden;background:#000}
body.gw .cv{position:absolute;inset:0;padding:0;display:flex;align-items:center;justify-content:center;overflow:hidden}
body.gw canvas{max-width:100vw;max-height:100vh;margin:0}
body.gw #up{display:none}
#gwbar{position:fixed;top:4px;left:4px;z-index:9;display:flex;gap:5px;background:rgba(15,20,28,.9);padding:5px 8px;border-radius:10px;max-width:calc(100vw - 16px)}
#gwbar button,#gwbar select{font-size:15px;padding:8px 12px}
#gwhint{color:#b6ffb6;font-size:12px;max-width:80vw}
#gwinfo{color:#ffd6a0;font-size:12px;max-width:80vw;word-break:break-all}
.gwrow{display:flex;gap:6px;flex-wrap:wrap;align-items:center}
.gwchip{font-size:13px!important;padding:6px 10px!important}
.gwchip.on{background:#2d4a3a;border-color:#3ddc97;color:#3ddc97}
#gwbar{flex-direction:column;align-items:flex-start}
.ddb{margin-left:4px}
#gwpop{position:fixed;inset:0;background:rgba(0,0,0,.55);z-index:30;display:flex;align-items:center;justify-content:center}
#gwpop .box{background:#171a22;border:1px solid #2a2f3a;border-radius:10px;max-height:82vh;overflow:auto;min-width:240px}
#gwpop .opt{padding:12px 18px;font-size:16px;color:#e8eaf0;border-bottom:1px solid #2a2f3a}
#gwpop .opt.cur{background:#2d4a3a;color:#3ddc97}
#drawer{display:none;position:fixed;top:0;right:0;bottom:0;width:min(560px,66vw);overflow:auto;background:#12161e;z-index:8;border-left:1px solid #2a2f3a;padding-top:58px}

#splash{position:fixed;inset:0;z-index:100;overflow:hidden;display:flex;flex-direction:column;align-items:center;justify-content:center;background:radial-gradient(ellipse at 50% 38%,#0f3b2a 0%,#06130d 62%,#000 100%);transition:opacity .8s}
#splash.out{opacity:0;pointer-events:none}
#splash .t{display:flex;font:900 clamp(30px,8.2vw,92px) 'Segoe UI',system-ui,sans-serif;letter-spacing:.05em}
#splash .t span{display:inline-block;opacity:0;transform:translateY(46px) scale(.55) rotate(-9deg);
  background:linear-gradient(100deg,#ffe38a 0%,#ffb300 38%,#fff7d6 50%,#ffb300 62%,#ffe38a 100%);background-size:260% 100%;
  -webkit-background-clip:text;background-clip:text;color:transparent;filter:drop-shadow(0 0 16px rgba(255,190,40,.55));
  animation:gwpop .75s cubic-bezier(.2,1.5,.4,1) forwards,gwshine 2.4s linear infinite}
#splash .line{width:0;height:2px;margin-top:12px;background:linear-gradient(90deg,transparent,#3ddc97,transparent);animation:gwgrow 1.2s ease 1.1s forwards}
#splash .c{margin-top:10px;font:300 clamp(13px,3vw,30px) system-ui,sans-serif;text-transform:uppercase;color:#bfffe0;opacity:0;animation:gwup 1s ease 1.4s forwards}
#splash .p{position:absolute;border-radius:50%;background:#ffd34d;opacity:0;animation:gwrise linear infinite}
@keyframes gwpop{to{opacity:1;transform:none}}
@keyframes gwshine{to{background-position:-260% 0}}
@keyframes gwgrow{to{width:min(62vw,560px)}}
@keyframes gwup{from{opacity:0;transform:translateY(14px);letter-spacing:.2em}to{opacity:1;transform:none;letter-spacing:.55em}}
@keyframes gwrise{0%{transform:translateY(0);opacity:0}20%{opacity:.85}100%{transform:translateY(-75vh);opacity:0}}

body.gw #gwbar,body.gw #drawer{--x:0}
#gwL,#gwR{position:fixed;top:0;bottom:0;z-index:9;display:flex;flex-direction:column;gap:7px;padding:7px;background:rgba(14,34,26,.95);overflow:auto;color:#e8eaf0}
#gwL{left:0;width:min(172px,20vw);border-right:1px solid #2d6e52}
#gwR{right:0;width:min(150px,18vw);border-left:1px solid #2d6e52}
#gwB{position:fixed;left:min(172px,20vw);right:min(150px,18vw);bottom:0;z-index:9;padding:4px 12px 6px;min-height:36px;background:linear-gradient(0deg,rgba(14,34,26,.92),rgba(14,34,26,.55));pointer-events:none}
#gwB #gwhint{color:#b6ffb6;font-size:13px}
#gwB #gwinfo{color:#ffd6a0;font-size:12px;word-break:break-all}
#gwL .brand{font:900 13px system-ui;letter-spacing:.04em;background:linear-gradient(100deg,#ffe38a,#ffb300,#fff7d6,#ffb300);-webkit-background-clip:text;background-clip:text;color:transparent;line-height:1.1}
#gwL .brand small{display:block;font:300 9px system-ui;letter-spacing:.3em;color:#bfffe0;-webkit-text-fill-color:#bfffe0}
.lab{font-size:11px;color:#8fd9b6;text-transform:uppercase;letter-spacing:.06em;margin-top:2px}
.cbs{display:flex;flex-wrap:wrap;gap:6px}
.cb{min-width:36px;height:36px;border-radius:50%;font-size:15px;font-weight:700;background:#14281f;border:2px solid;padding:0!important}
.cb.hu{border-color:#ffd400;color:#ffd400}.cb.ro{border-color:#9ec5ff;color:#9ec5ff}
.cb.on{background:#3ddc97;color:#06130d}.cb.tg.on{background:#ff6b6b;color:#1a0505}.cb.dis{opacity:.3}
#gwL button.big,#gwR button.big{font-size:15px;font-weight:700;padding:11px 8px;border-radius:10px;background:#1f6b47;border:1px solid #3ddc97;color:#fff}
#gwR button.go{background:#7a5a00;border-color:#ffd34d}
.gwchip.mb{width:100%;text-align:left;font-size:13px!important;padding:7px 9px!important;border-radius:8px}
.mlist{display:flex;flex-direction:column;gap:5px}
#gwR .top{display:flex;gap:6px}#gwR .top button{flex:1;font-size:16px;padding:6px}
#gwshow{display:none;position:fixed;top:6px;left:6px;z-index:10;font-size:16px;padding:8px 12px}
body.nopan #gwL,body.nopan #gwR,body.nopan #gwB{display:none}
body.nopan #gwshow{display:block}
#drawer{padding-top:0!important}
#drawer .dh{position:sticky;top:0;z-index:2;display:flex;justify-content:space-between;align-items:center;padding:8px 12px;background:#173a2c;border-bottom:1px solid #2d6e52;font-size:15px}

.gwpanel{position:fixed;top:0;bottom:0;z-index:9;display:flex;flex-direction:column;gap:6px;padding:8px 7px;overflow-y:auto;background:linear-gradient(180deg,#10301f,#081a12);box-shadow:0 0 18px rgba(0,0,0,.6)}
#gwL{left:0;width:17.5vw;border-right:2px solid #2d6e52}
#gwR{right:0;width:16.5vw;border-left:2px solid #2d6e52}
.gwpanel button{font-size:13px;padding:8px 5px;border-radius:9px;background:#1d3f2e;border:1px solid #2d6e52;color:#e8f5ec;text-align:center;line-height:1.15}
.gwpanel button.on{background:#2f7a4f;border-color:#ffd24a;color:#fff;box-shadow:0 0 8px rgba(255,210,74,.55)}
.gwpanel button.big{font-size:15px;font-weight:700;padding:11px 5px;background:linear-gradient(180deg,#2f9a64,#1f6e46);border-color:#7fe3a8}
.gwpanel button.go{background:linear-gradient(180deg,#e0a82e,#b87f12);border-color:#ffe08a;color:#1a1204}
.gwpanel .lbl{font-size:10.5px;color:#8fd1ac;letter-spacing:.08em;text-transform:uppercase;margin-top:3px}
.gwpanel .seg{display:flex;gap:5px}.gwpanel .seg button{flex:1;padding:8px 2px}
#gwmods{display:flex;flex-direction:column;gap:5px}
.brand{font:800 13px/1.1 system-ui;color:#ffd24a;text-align:center;letter-spacing:.05em;padding:2px 0 4px}
.brand span{display:block;font-size:9.5px;color:#8fd1ac;font-weight:400;letter-spacing:.22em;margin-top:2px}
#gwstat{position:fixed;left:18vw;right:17vw;bottom:6px;z-index:9;background:rgba(8,26,18,.9);border:1px solid #2d6e52;border-radius:10px;padding:6px 10px;font-size:13px}
#gwhint{color:#b6ffb6}#gwinfo{color:#ffd6a0;word-break:break-all;max-height:3.7em;overflow:hidden}
#drawer{left:18vw;right:17vw;top:6px;bottom:6px;width:auto;border-radius:12px;border:1px solid #2d6e52;padding-top:52px;z-index:20}
#drh{position:fixed;left:18vw;right:17vw;top:6px;z-index:21;padding:6px;background:#12161e;border-radius:12px 12px 0 0;display:none}
#gwsplash{position:fixed;inset:0;z-index:50;display:flex;flex-direction:column;align-items:center;justify-content:center;background:radial-gradient(ellipse at 50% 42%,#14472f 0%,#071a11 65%,#030a07 100%);transition:opacity .9s}
#gwsplash.out{opacity:0;pointer-events:none}
#gwsplash svg{position:absolute;inset:0;width:100%;height:100%;opacity:.55}
#gwsplash path{fill:none;stroke:#ffd24a;stroke-width:3;stroke-linecap:round;stroke-linejoin:round;stroke-dasharray:2600;stroke-dashoffset:2600;filter:drop-shadow(0 0 6px #ffd24a);animation:gwdraw 2.8s .1s ease-out forwards}
@keyframes gwdraw{to{stroke-dashoffset:0}}
#gwsplash .t{display:flex;font:800 min(8.5vw,60px) system-ui;letter-spacing:.06em;z-index:2}
#gwsplash .t span{opacity:0;transform:translateY(26px) scale(.6);filter:blur(8px);background:linear-gradient(90deg,#ffe9a6,#ffd24a,#7fe3a8);-webkit-background-clip:text;background-clip:text;color:transparent;animation:gwin .65s forwards}
@keyframes gwin{to{opacity:1;transform:none;filter:none}}
#gwsplash .s{margin-top:6px;font:300 min(3.4vw,24px) system-ui;color:#8fd1ac;opacity:0;z-index:2;animation:gws 1.6s .95s forwards}
@keyframes gws{from{opacity:0;letter-spacing:1.3em}to{opacity:1;letter-spacing:.55em}}
</style></head><body><div class="w">
<div class="r">
 <input type="file" id="file" accept="image/*" hidden>
 <button class="p" id="up">📁 Скриншот (или Ctrl+V)</button>
 <label>Режим <select id="mode">
  <option value="pick">Выбор бойца и врага (тап по кружку)</option>
  <option value="auto">1. Поле: клик внутри (авто)</option>
  <option value="f1">1. Поле: левый верх (вручную)</option>
  <option value="f2">1. Поле: правый низ (вручную)</option>
  <option value="me">2. Я (солдат)</option>
  <option value="en">3. Враг (можно несколько)</option>
  <option value="draw" selected>4. Рисовать</option>
  <option value="move">Двигать маркеры</option></select></label>
 <label><input type="checkbox" id="ac" checked> авто-центр по цвету</label>
 <label>допуск <input type="range" id="tol" min="10" max="150" value="60"></label>
 <button id="grid" class="on">Сетка</button><button id="undo">↶ Штрих</button><button id="clr">Очистить</button><button id="obs">🧱 Препятствия</button><button id="dele">− враг</button>
</div>
<div class="r">
 <label>Поле X×Y клеток <input type="number" id="fx" value="50" min="5"> × <input type="number" id="fy" value="30" min="5"></label>
 <label>Начало координат <select id="org"><option value="c">центр поля (как в Graphwar)</option><option value="s">солдат</option></select></label>
 <span class="b" id="bf">поле: —</span><span class="b" id="bm">я: —</span><span class="b" id="be">враг: —</span><span id="asp" style="color:var(--mu)"></span>
</div>
<div class="cv"><canvas id="c" width="900" height="550"></canvas></div>
<div class="r">
 <label>Подстройка <select id="ns"><option value="p1">угол ↖</option><option value="p2">угол ↘</option><option value="me">я</option></select></label>
 <button id="nl">◀</button><button id="nu">▲</button><button id="nd">▼</button><button id="nrr">▶</button>
 <label>шаг <select id="nst"><option>0.2</option><option>0.5</option><option selected>1</option><option>3</option><option>10</option></select> px</label>
 <button id="fh" title="Высота рамки = ширина × Y/X">↕ по ширине</button><button id="fw" title="Ширина рамки = высота × X/Y">↔ по высоте</button>
</div>
<div class="r">
 <label>Синтаксис <select id="syn"><option value="gw">Graphwar</option><option value="desmos">Desmos</option><option value="py">Python</option><option value="js">JavaScript</option></select></label>
 <label>Модель <select id="mod"><option value="short">Короткая (авто)</option><option id="opt-tower" value="tower">Арка + прямая во врага (форма с видео, 1 враг)</option><option value="trace">Как нарисовано (точно, с вертикалями)</option><option value="path">Авто-путь (обход препятствий)</option><option value="piece">Кусочная (abs)</option><option value="poly">Полином</option><option value="sin">Синус</option><option value="exp">Экспонента</option></select></label>
 <label id="dg" hidden>Степень <select id="deg"><option>1</option><option>2</option><option selected>3</option><option>4</option><option>5</option><option>6</option></select></label>
 <label id="tg" hidden>Детализация <input type="range" id="pt" min="1" max="40" value="8"></label>
 <label><input type="checkbox" id="pin" checked> через меня и врага</label>
 <label>цифр <select id="prec"><option value="auto" selected>авто</option><option value="0">все</option><option>3</option><option>4</option><option>5</option></select></label>
 <label><input type="checkbox" id="nsp" checked> без пробелов</label>
 <label>запас <input type="range" id="mrg" min="0" max="1.5" step="0.1" value="0.5"></label>
</div>
<div id="eq"><label>Уравнение</label><span id="eqv">—</span><button id="cp">📋 Скопировать</button> <button id="tb">⌨ Ввод вручную</button> <span id="r2" style="color:var(--mu)"></span></div>
<div id="tp" hidden style="padding:8px 14px;border-top:1px solid var(--ln);background:#12161e"></div>
<div id="st"><span id="msg">Загрузи скриншот</span><span id="dbg" style="font:11px ui-monospace,monospace"></span><span class="co" id="co">—</span></div>
</div>
<script>
(()=>{"use strict";
const $=id=>document.getElementById(id),cv=$('c'),cx=cv.getContext('2d');
let K=1;
const S={cand:[],gwText:'',img:null,data:null,W:900,H:550,p1:null,p2:null,me:null,ens:[],strokes:[],cur:null,drag:null,fit:null,grid:true,showObs:false};
const getP=k=>k[0]==='e'?S.ens[+k.slice(1)]:S[k];
const setP=(k,p)=>{if(k[0]==='e')S.ens[+k.slice(1)]=p;else S[k]=p};
const keys=()=>['p1','p2','me',...S.ens.map((_,i)=>'e'+i)];
function syncNs(){const v=$('ns').value;$('ns').innerHTML='<option value="p1">угол ↖</option><option value="p2">угол ↘</option><option value="me">я</option>'+S.ens.map((_,i)=>`<option value="e${i}">враг ${i+1}</option>`).join('');if(keys().includes(v))$('ns').value=v;$('opt-tower').disabled=S.ens.length!==1}
const FX=()=>Math.max(1,+$('fx').value||50),FY=()=>Math.max(1,+$('fy').value||30);

/* ── калибровка: поле → клетки (центр поля = 0,0), оси X и Y масштабируются независимо ── */
function cal(){
  if(!S.p1||!S.p2)return null;
  const l=Math.min(S.p1.x,S.p2.x),t=Math.min(S.p1.y,S.p2.y);
  return{l,t,r:Math.max(S.p1.x,S.p2.x),b:Math.max(S.p1.y,S.p2.y),
    sx:Math.abs(S.p2.x-S.p1.x)/FX(),sy:Math.abs(S.p2.y-S.p1.y)/FY()};
}
const fieldXY=(p,c)=>({x:(p.x-c.l)/c.sx-FX()/2,y:FY()/2-(p.y-c.t)/c.sy}); // координаты поля от центра
function off(c){ // смещение начала координат
  if(!S.ode&&$('org').value==='s'&&S.me&&c){const m=fieldXY(S.me,c);return m}
  return{x:0,y:0};
}
function toG(p){const c=cal();if(!c)return null;const f=fieldXY(p,c),o=off(c);return{x:f.x-o.x,y:f.y-o.y}}
function toP(g){const c=cal(),o=off(c);return{x:c.l+(g.x+o.x+FX()/2)*c.sx,y:c.t+(FY()/2-(g.y+o.y))*c.sy}}

/* ── поиск по цвету (заливка) ── */
function flood(x,y,tol,maxN){
  const{W,H}=S,d=S.data.data;x|=0;y|=0;
  const i0=(y*W+x)*4,r=d[i0],g=d[i0+1],b=d[i0+2],seen=new Uint8Array(W*H),st=[y*W+x];
  seen[st[0]]=1;let n=0,sx=0,sy=0,x0=W,x1=0,y0=H,y1=0;
  while(st.length&&n<maxN){
    const q=st.pop(),px=q%W,py=(q/W)|0;n++;sx+=px;sy+=py;
    if(px<x0)x0=px;if(px>x1)x1=px;if(py<y0)y0=py;if(py>y1)y1=py;
    for(const k of[px>0?q-1:-1,px<W-1?q+1:-1,py>0?q-W:-1,py<H-1?q+W:-1]){
      if(k<0||seen[k])continue;seen[k]=1;const j=k*4;
      if(Math.abs(d[j]-r)+Math.abs(d[j+1]-g)+Math.abs(d[j+2]-b)<=tol)st.push(k);
    }
  }
  return{n,cx:sx/n+.5,cy:sy/n+.5,x0,x1,y0,y1};
}

/* ── поле: нейтральные (серые/белые/чёрные) пиксели по строкам и столбцам.
   Рамка интерфейса зелёная, препятствия чёрные — поэтому препятствия поле не режут ── */
function fieldBox(p){ // профили считаются один раз на картинку и кешируются в S.prof
  const{W,H}=S;
  if(!S.prof){
    const d=S.data.data,nc=new Int32Array(W),nr=new Int32Array(H),bc=new Int32Array(W),br=new Int32Array(H);
    for(let y=0;y<H;y++)for(let x=0;x<W;x++){
      const i=(y*W+x)*4,a=d[i],b=d[i+1],c=d[i+2],mn=Math.min(a,b,c);
      if(Math.max(a,b,c)-mn<=8){nc[x]++;nr[y]++;if(mn>190){bc[x]++;br[y]++}}
    }
    S.prof={nc,nr,bc,br};
  }
  const{nc,nr,bc,br}=S.prof;
  const run=(a,s)=>{
    let mx=0;for(const v of a)if(v>mx)mx=v;const th=mx*.5,sol=i=>a[i]>th;
    let lo=s,hi=s,g=0;
    for(let i=s;i>=0;i--){if(sol(i)){lo=i;g=0}else if(++g>8)break}
    g=0;for(let i=s;i<a.length;i++){if(sol(i)){hi=i;g=0}else if(++g>8)break}
    const cnt=(i,j)=>{let n=0;for(let k=Math.max(0,i);k<=j&&k<a.length;k++)if(sol(k))n++;return n};
    while(lo<hi&&cnt(lo,lo+11)<10)lo++;   // отрезаем одиночные линии рамки
    while(hi>lo&&cnt(hi-11,hi)<10)hi--;
    return[lo,hi+1]};
  const refine=([lo,hi],b)=>{ // отрезаем чёрную окантовку: у края поля должны быть светлые пиксели
    let m=0;for(let i=lo;i<hi;i++)if(b[i]>m)m=b[i];const t=.3*m;
    while(lo<hi&&b[lo]<t)lo++;while(hi>lo&&b[hi-1]<t)hi--;return[lo,hi]};
  const[x0,x1]=refine(run(nc,Math.min(W-1,p.x|0)),bc),[y0,y1]=refine(run(nr,Math.min(H-1,p.y|0)),br);
  return x1-x0>50&&y1-y0>50?{x0,x1,y0,y1}:null;
}
/* ── отрисовка ── */
function marker(p,col,lab){
  cx.save();cx.strokeStyle=cx.fillStyle=col;cx.lineWidth=2*K;
  cx.beginPath();cx.arc(p.x,p.y,10*K,0,7);cx.stroke();
  cx.beginPath();cx.arc(p.x,p.y,2.5*K,0,7);cx.fill();
  cx.font=`bold ${11*K}px system-ui`;cx.textBaseline='middle';
  const w=cx.measureText(lab).width;cx.fillStyle='rgba(15,17,22,.9)';cx.fillRect(p.x+13*K,p.y-24*K,w+8*K,15*K);
  cx.fillStyle=col;cx.fillText(lab,p.x+17*K,p.y-16.5*K);cx.restore();
}
function drawGrid(c){
  const X=FX(),Y=FY(),o=off(c),step=c.sx<7?5:1;
  cx.save();cx.font=`bold ${10*K}px system-ui`;
  for(let i=0;i<=X;i+=step){
    const x=c.l+i*c.sx,M=i%10===0;
    cx.strokeStyle=M?'rgba(255,60,60,.9)':'rgba(255,60,60,.3)';cx.lineWidth=(M?1.5:1)*Math.max(1,K*.6);
    cx.beginPath();cx.moveTo(x,c.t);cx.lineTo(x,c.b);cx.stroke();
    if(M){cx.fillStyle='#ffd0d0';cx.textBaseline='top';cx.fillText(+(i-X/2-o.x).toFixed(1),x+2,c.t+2)}
  }
  for(let j=0;j<=Y;j+=step){
    const y=c.t+j*c.sy,M=j%5===0;
    cx.strokeStyle=M?'rgba(255,60,60,.9)':'rgba(255,60,60,.3)';cx.lineWidth=(M?1.5:1)*Math.max(1,K*.6);
    cx.beginPath();cx.moveTo(c.l,y);cx.lineTo(c.r,y);cx.stroke();
    if(M){cx.fillStyle='#ffd0d0';cx.textBaseline='bottom';cx.fillText(+(Y/2-j-o.y).toFixed(1),c.l+3,y-2)}
  }
  const z=toP({x:0,y:0});cx.strokeStyle='#ff2828';cx.lineWidth=2*Math.max(1,K*.6);cx.beginPath();
  cx.moveTo(c.l,z.y);cx.lineTo(c.r,z.y);cx.moveTo(z.x,c.t);cx.lineTo(z.x,c.b);cx.stroke();cx.restore();
}
function loupe(p){ // лупа ×3.75 в углу напротив точки
  if(!p||!S.img)return;
  const L=150*K,sw=L/3.75,x=p.x<S.W/2?S.W-L-8*K:8*K,y=8*K;
  cx.save();cx.imageSmoothingEnabled=false;cx.drawImage(S.img,p.x-sw/2,p.y-sw/2,sw,sw,x,y,L,L);
  cx.strokeStyle='#ffd400';cx.lineWidth=2*K;cx.strokeRect(x,y,L,L);
  cx.strokeStyle='#ff2828';cx.lineWidth=K;cx.beginPath();
  cx.moveTo(x+L/2-14*K,y+L/2);cx.lineTo(x+L/2+14*K,y+L/2);cx.moveTo(x+L/2,y+L/2-14*K);cx.lineTo(x+L/2,y+L/2+14*K);
  cx.stroke();cx.restore();
}
let rq=0,ft=0;
const draw=()=>{if(!rq)rq=requestAnimationFrame(()=>{rq=0;redraw()})};
const schedFit=ms=>{clearTimeout(ft);ft=setTimeout(()=>{refit();draw()},ms)};
const HINT={auto:'1/4 · тап по белому полю',f1:'тап: левый верхний угол',f2:'тап: правый нижний угол',me:'2/4 · тап по центру своего солдата',en:'3/4 · тап по врагу',draw:'4/4 · рисуй кривую от себя к врагу',move:'тащи маркеры'};
function banner(){
  const t=HINT[$('mode').value];if(!t||!S.img)return;
  cx.save();cx.font=`bold ${13*K}px system-ui`;cx.textAlign='center';cx.textBaseline='middle';
  const w=cx.measureText(t).width+16*K,y=S.H-20*K;
  cx.fillStyle='rgba(15,17,22,.85)';cx.fillRect(S.W/2-w/2,y-12*K,w,24*K);
  cx.fillStyle='#ffd400';cx.fillText(t,S.W/2,y);cx.restore();
}
function stroke(s){if(!s.length)return;cx.beginPath();cx.moveTo(s[0].x,s[0].y);for(const p of s)cx.lineTo(p.x,p.y);cx.stroke()}
function redraw(){
  K=Math.max(1,S.W/(cv.clientWidth||S.W));
  cx.fillStyle='#0a0c10';cx.fillRect(0,0,S.W,S.H);
  if(S.img)cx.drawImage(S.img,0,0);
  const c=cal();
  if(S.grid){
    if(c)drawGrid(c);
    else if(S.p1){cx.strokeStyle='#4dd0e1'}
  }
  if(S.showObs&&c&&S.data){cx.save();drawObs(c);cx.restore()}
  if(c){cx.strokeStyle='#4dd0e1';cx.lineWidth=2*Math.max(1,K*.6);cx.setLineDash([6*K,4*K]);cx.strokeRect(c.l,c.t,c.r-c.l,c.b-c.t);cx.setLineDash([])}
  cx.strokeStyle='#9aa4bd';cx.lineWidth=2*K;cx.lineJoin=cx.lineCap='round';
  S.strokes.forEach(stroke);if(S.cur)stroke(S.cur);
  if(S.fit&&c){
    cx.strokeStyle='#ff5c7a';cx.lineWidth=2*K;cx.beginPath();let on=false;
    for(let px=c.l;px<=c.r;px+=.5){
      const g=toG({x:px,y:0}),y=S.fit(g.x);
      if(!isFinite(y)){on=false;continue}
      const p=toP({x:g.x,y});
      if(p.y<c.t-300||p.y>c.b+300){on=false;continue}
      on?cx.lineTo(px,p.y):cx.moveTo(px,p.y);on=true;
    }
    cx.stroke();
  }
  if(S.p1)marker(S.p1,'#4dd0e1','угол ↖');
  if(S.p2)marker(S.p2,'#4dd0e1','угол ↘');
  if(S.me)marker(S.me,'#3ddc97','Я');
  for(const q of S.cand){
    if(sameP(q,S.me)||S.ens.some(e=>sameP(e,q)))continue;
    cx.save();cx.strokeStyle=q.kind==='h'?'#ffd400':q.kind==='t'?'#ff7a7a':'#9ec5ff';cx.lineWidth=2*K;cx.beginPath();cx.arc(q.x,q.y,18*K,0,7);cx.stroke();
    cx.font=`bold ${13*K}px system-ui`;cx.textBaseline='middle';cx.textAlign='center';
    cx.fillStyle='rgba(15,17,22,.85)';cx.fillRect(q.x-9*K,q.y-34*K,18*K,16*K);cx.fillStyle=cx.strokeStyle;cx.fillText(q.n,q.x,q.y-26*K);cx.restore();
  }
  S.ens.forEach((q,i)=>marker(q,'#ff6b6b','ВРАГ '+(i+1)));
  if(S.tap&&S.tap.m!=='pick'){const q=S.tap.p;cx.strokeStyle='#ffd400';cx.lineWidth=2*K;cx.beginPath();cx.arc(q.x,q.y,10*K,0,7);cx.stroke();loupe(q)}
  else if(S.drag)loupe(getP(S.drag));else if(S.lp)loupe(getP(S.lp));
  banner();
  badges();
}
function badges(){
  const c=cal(),set=(id,t,ok)=>{$(id).textContent=t;$(id).classList.toggle('ok',ok)};
  set('bf',c?`поле: ${FX()}×${FY()} (${c.sx.toFixed(1)}×${c.sy.toFixed(1)} px/кл.)`:'поле: —',!!c);
  const fm=p=>{const g=toG(p);return`(${g.x.toFixed(1)}, ${g.y.toFixed(1)})`};
  set('bm',S.me&&c?'я: '+fm(S.me):'я: —',!!(S.me&&c));
  set('be',S.ens.length&&c?'враги: '+S.ens.map(fm).join(' '):'враг: —',!!(S.ens.length&&c));
  if(c){const a=(c.r-c.l)/(c.b-c.t),e=FX()/FY();
    $('asp').textContent=Math.abs(a/e-1)>.12?`⚠ пропорции рамки ${a.toFixed(2)} ≠ ${e.toFixed(2)} (X/Y) — проверь размер поля`:'';}
  else $('asp').textContent='';
}

/* ── загрузка ── */
function load(src){
  const im=new Image();
  im.onload=()=>{
    S.img=im;S.W=cv.width=im.width;S.H=cv.height=im.height;
    const t=document.createElement('canvas');t.width=im.width;t.height=im.height;
    const tx=t.getContext('2d');tx.drawImage(im,0,0);S.data=tx.getImageData(0,0,im.width,im.height);
    Object.assign(S,{p1:null,p2:null,me:null,ens:[],strokes:[],cur:null,fit:null,prof:null,tap:null,thick:null,og:null,cand:[],gwText:''});syncNs();setTimeout(()=>fieldBox({x:0,y:0}),30);
    if(GWM){afterShot();return}
    $('mode').value='auto';msg('Нажми пальцем внутри игрового поля и отпусти — рамка найдётся сама','wa');
    refit();redraw();
  };im.src=src;
}
$('up').onclick=()=>$('file').click();
const rd=f=>{const r=new FileReader();r.onload=()=>load(r.result);r.readAsDataURL(f)};
$('file').onchange=e=>{const f=e.target.files[0];if(f)rd(f)};
addEventListener('paste',e=>{for(const it of e.clipboardData.items)if(it.type.startsWith('image/')){rd(it.getAsFile());break}});

/* ── ввод ── */
function pos(e){const r=cv.getBoundingClientRect();return{x:(e.clientX-r.left)*cv.width/r.width,y:(e.clientY-r.top)*cv.height/r.height}}
function msg(t,c){const gh=document.getElementById('gwhint');if(gh)gh.textContent=String(t).replace(/<[^>]+>/g,'');$('msg').innerHTML=c?`<span style="color:var(--${c})">${t}</span>`:t}
function near(p){return keys().find(k=>{const q=getP(k);return q&&Math.hypot(q.x-p.x,q.y-p.y)<22*K})}
function lock(p,pred,bbox){ // уточняем центр спрайта: пиксели нужного цвета в круге ~1.1 клетки, 5 итераций
  const c=cal(),R=Math.round(1.1*Math.min(c.sx,c.sy)),d=S.data.data,W=S.W,H=S.H;let x=p.x,y=p.y,ok=false;
  for(let it=0;it<5;it++){
    let sx=0,sy=0,n=0,x0=1e9,x1=-1,y0=1e9,y1=-1;
    for(let yy=Math.max(0,Math.round(y-R));yy<=Math.min(H-1,Math.round(y+R));yy++)
      for(let xx=Math.max(0,Math.round(x-R));xx<=Math.min(W-1,Math.round(x+R));xx++){
        if((xx+.5-x)**2+(yy+.5-y)**2>R*R)continue;const i=(yy*W+xx)*4;
        if(pred(d[i],d[i+1],d[i+2])){sx+=xx+.5;sy+=yy+.5;n++;x0=Math.min(x0,xx);x1=Math.max(x1,xx+1);y0=Math.min(y0,yy);y1=Math.max(y1,yy+1)}
      }
    if(n<12)return ok?{x,y}:null;ok=true;
    if(bbox){x=(x0+x1)/2;y=(y0+y1)/2}else{x=sx/n;y=sy/n}
  }
  return{x,y};
}
function pick(p,tol){ // солдат: голова (зелёная каска + жёлтое лицо), мишень: все насыщенные пиксели; иначе — заливка
  if(!$('ac').checked||!S.data)return p;
  const sat=(r,g,b)=>Math.max(r,g,b)-Math.min(r,g,b)>80;
  const head=(r,g,b)=>g>=r*.55&&g>b+40&&Math.max(r,g,b)-Math.min(r,g,b)>40;
  const q=lock(p,head,true)||lock(p,sat,false);
  if(q)return q;
  const f=flood(Math.min(S.W-1,Math.max(0,p.x))|0,Math.min(S.H-1,Math.max(0,p.y))|0,tol,6000);
  return f.n>=4&&f.n<6000?{x:f.cx,y:f.cy}:p;
}
const cnt={d:0,u:0,c:0};
const dbg=()=>{$('dbg').textContent=`касаний ${cnt.d} · отпусканий ${cnt.u} · отмен ${cnt.c}`};
function commit(m,p){ // действие выполняется при отпускании пальца, в точке под лупой
  const tol=+$('tol').value;
  if(m==='auto'){
    const b=fieldBox(p);
    if(!b){msg('Поле не найдено — отметь углы вручную (режимы «Поле: левый верх / правый низ»)','wa');return}
    S.p1={x:b.x0,y:b.y0};S.p2={x:b.x1,y:b.y1};
    $('mode').value='me';msg('Поле найдено. Если рамка неточная — подстрой её (режим «Двигать маркеры» или кнопки под картинкой). Теперь прижми палец к своему солдату, наведи по лупе и отпусти','ok');
  }else if(m==='f1'){S.p1=p;$('mode').value='f2';msg('Правый нижний угол поля: прижми, наведи по лупе, отпусти','wa')}
  else if(m==='f2'){S.p2=p;$('mode').value='me';msg('Прижми палец к своему солдату, наведи по лупе, отпусти','wa')}
  else if(m==='me'){S.me=pick(p,tol);$('mode').value='en';msg('Теперь то же самое для врага','wa')}
  else if(m==='pick'){
    let q=null,bd=44*K;for(const c of S.cand){const dd=Math.hypot(c.x-p.x,c.y-p.y);if(dd<bd){bd=dd;q=c}}
    if(!q){msg('Тапни по кружку (боец, бот, игрок или мишень)','wa');return}
    const isMe=S.me&&sameP(S.me,q),ie=S.ens.findIndex(e=>sameP(e,q));
    if(S.role==='me'){
      if(isMe){S.me=null;msg('Выбери своего бойца','wa')}
      else{S.me={x:q.x,y:q.y};if(ie>=0)S.ens.splice(ie,1);S.role='foe';msg('Боец выбран. Теперь тапни по цели (бот, игрок или мишень)','ok')}
    }else{
      if(isMe){S.me=null;S.role='me';msg('Выбери своего бойца','wa')}
      else if(ie>=0){S.ens.splice(ie,1);msg('Цель снята. Целей: '+S.ens.length,'ok')}
      else{S.ens.push({x:q.x,y:q.y});msg('Целей выбрано: '+S.ens.length,'ok')}
    }
    syncNs();autoModel();
  }
  else if(m==='en'){S.ens.push(pick(p,tol));syncNs();msg(`Врагов: ${S.ens.length}. Добавь ещё (прижми и отпусти) или выбери модель «Авто-путь» / режим «Рисовать»`,'ok')}
  refit();redraw();
}
cv.addEventListener('pointerdown',e=>{
  cnt.d++;dbg();
  if(!S.img||!e.isPrimary)return;
  const p=pos(e),m=$('mode').value;
  if(m==='move'){const k=near(p);if(k){S.drag=k;$('ns').value=k;cv.setPointerCapture(e.pointerId);redraw()}}
  else if(m==='draw'){cv.setPointerCapture(e.pointerId);S.cur=[p]}
  else{cv.setPointerCapture(e.pointerId);S.tap={m,p};redraw()}
});
cv.addEventListener('pointermove',e=>{
  const p=pos(e),g=cal()?toG(p):null;
  $('co').textContent=g?`клетка: ${g.x.toFixed(2)}  ${g.y.toFixed(2)}`:'—';
  if(S.tap){S.tap.p=p;redraw();return}
  if(S.drag){setP(S.drag,p);refit();redraw();return}
  if(S.cur){const l=S.cur[S.cur.length-1];if(Math.hypot(p.x-l.x,p.y-l.y)>=2){S.cur.push(p);redraw()}}
});
const end=e=>{
  if(e){cnt[e.type==='pointercancel'?'c':'u']++;dbg()}
  if(S.tap){const t=S.tap;S.tap=null;commit(t.m,t.p);return}  // даже если браузер отменил жест — считаем его нажатием
  if(S.drag){S.drag=null;refit();redraw();return}
  if(S.cur){if(S.cur.length>1)S.strokes.push(S.cur);S.cur=null;refit();redraw()}
};
cv.addEventListener('pointerup',end);cv.addEventListener('pointercancel',end);
for(const t of['touchstart','touchmove'])cv.addEventListener(t,e=>e.preventDefault(),{passive:false});
cv.addEventListener('contextmenu',e=>e.preventDefault());

/* ── математика ── */
function solve(A,b){
  const n=b.length,M=A.map((r,i)=>[...r,b[i]]);
  for(let c=0;c<n;c++){
    let p=c;for(let r=c+1;r<n;r++)if(Math.abs(M[r][c])>Math.abs(M[p][c]))p=r;
    if(Math.abs(M[p][c])<1e-13)return null;[M[c],M[p]]=[M[p],M[c]];
    for(let r=0;r<n;r++){if(r===c)continue;const f=M[r][c]/M[c][c];for(let k=c;k<=n;k++)M[r][k]-=f*M[c][k]}
  }
  return M.map((r,i)=>r[n]/r[i]);
}
function lstsq(pts,B){
  const n=B.length,A=Array.from({length:n},()=>Array(n).fill(0)),b=Array(n).fill(0);
  for(const p of pts){const f=B.map(g=>g(p));for(let i=0;i<n;i++){for(let j=0;j<n;j++)A[i][j]+=f[i]*f[j];b[i]+=f[i]*p.y}}
  return solve(A,b);
}
const rss=(pts,fn)=>pts.reduce((s,p)=>s+(fn(p.x)-p.y)**2,0);
function r2(pts,fn){
  const m=pts.reduce((a,p)=>a+p.y,0)/pts.length,t=pts.reduce((s,p)=>s+(p.y-m)**2,0);
  return t<1e-12?1:1-rss(pts,fn)/t;
}
const binom=(n,k)=>{let r=1;for(let i=0;i<k;i++)r=r*(n-i)/(i+1);return r};
function polyFit(pts,d){
  const xs=pts.map(p=>p.x),a=Math.min(...xs),b=Math.max(...xs),m=(a+b)/2,s=(b-a)/2||1;
  const B=[];for(let k=0;k<=d;k++)B.push(p=>p.x**k);
  const c=lstsq(pts.map(p=>({x:(p.x-m)/s,y:p.y})),B);if(!c)return null;
  const R=Array(d+1).fill(0); // разворачиваем из нормированного x обратно
  for(let k=0;k<=d;k++){const v=c[k]/s**k;for(let j=0;j<=k;j++)R[j]+=v*binom(k,j)*(-m)**(k-j)}
  return{kind:'poly',c:R,k:d+1,fn:x=>R.reduceRight((v,q)=>v*x+q,0)};
}
function sineFit(pts){
  let best={rss:Infinity};
  const test=b=>{const c=lstsq(pts,[p=>Math.sin(b*p.x),p=>Math.cos(b*p.x),()=>1]);if(!c)return;
    const e=rss(pts,x=>c[0]*Math.sin(b*x)+c[1]*Math.cos(b*x)+c[2]);if(e<best.rss)best={b,c,rss:e}};
  for(let b=.02;b<=4;b+=.02)test(b);if(!best.c)return null;
  const b0=best.b;for(let b=Math.max(.001,b0-.025);b<=b0+.025;b+=.001)test(b);
  const[p,q,d]=best.c,a=Math.hypot(p,q),ph=Math.atan2(q,p),b=best.b;
  return{kind:'sin',a,b,ph,d,k:4,fn:x=>a*Math.sin(b*x+ph)+d};
}
function expFit(pts){
  let best={rss:Infinity};
  const test=b=>{if(pts.some(p=>Math.abs(b*p.x)>40))return;const c=lstsq(pts,[p=>Math.exp(b*p.x),()=>1]);if(!c)return;
    const e=rss(pts,x=>c[0]*Math.exp(b*x)+c[1]);if(e<best.rss)best={b,c,rss:e}};
  for(let b=-1;b<=1;b+=.01)test(b);if(!best.c)return null;
  const b0=best.b;for(let b=b0-.01;b<=b0+.01;b+=.001)test(b);
  const[a,c]=best.c,b=best.b;return{kind:'exp',a,b,c,k:3,fn:x=>a*Math.exp(b*x)+c};
}
function absFit(pts){
  const xs=pts.map(p=>p.x),a=Math.min(...xs),b=Math.max(...xs);let best={rss:Infinity};
  const test=h=>{const c=lstsq(pts,[p=>Math.abs(p.x-h),()=>1]);if(!c)return;
    const e=rss(pts,x=>c[0]*Math.abs(x-h)+c[1]);if(e<best.rss)best={h,c,rss:e}};
  for(let i=0;i<=240;i++)test(a+(b-a)*i/240);if(!best.c)return null;
  const st=(b-a)/240;for(let i=-60;i<=60;i++)test(best.h+st*i/60);
  const[k,c]=best.c,h=best.h;return{kind:'abs',a:k,h,c,k:3,fn:x=>k*Math.abs(x-h)+c};
}
function rdp(pts,tol){ // упрощение ломаной
  const n=pts.length,keep=new Uint8Array(n);keep[0]=keep[n-1]=1;const st=[[0,n-1]];
  while(st.length){const[i,j]=st.pop(),A=pts[i],B=pts[j],m=(B.y-A.y)/((B.x-A.x)||1e-9);let md=0,mi=-1;
    for(let k=i+1;k<j;k++){const d=Math.abs(pts[k].y-(A.y+m*(pts[k].x-A.x)));if(d>md){md=d;mi=k}}
    if(md>tol&&mi>0){keep[mi]=1;st.push([i,mi],[mi,j])}}
  return pts.filter((_,i)=>keep[i]);
}
function pieceFit(pts,tol){
  let t=Math.max(1e-3,tol),v;
  for(let i=0;i<25;i++){v=rdp(pts,t);if(v.length-1<=22)break;t*=1.6}
  if(v.length<2)return null;
  const sl=[];for(let i=0;i<v.length-1;i++)sl.push((v[i+1].y-v[i].y)/((v[i+1].x-v[i].x)||1e-9));
  // f(x)=A+B*x+Σ (dm/2)*|x-xi|: излом наклона на dm = слагаемое (dm/2)*abs
  const br=[];for(let i=1;i<sl.length;i++)br.push({x:v[i].x,h:(sl[i]-sl[i-1])/2});
  const B=sl[0]+br.reduce((s,q)=>s+q.h,0),x0=v[0].x;
  const A=v[0].y-B*x0-br.reduce((s,q)=>s+q.h*Math.abs(x0-q.x),0);
  return{kind:'piece',A,B,br,k:2+br.length,fn:x=>A+B*x+br.reduce((s,q)=>s+q.h*Math.abs(x-q.x),0)};
}
function shortest(pts){
  const cs=[];const add=(r,l)=>{if(r){r.r2=r2(pts,r.fn);r.label=l;cs.push(r)}};
  const avg=pts.reduce((a,p)=>a+p.y,0)/pts.length;
  add({kind:'poly',c:[avg],k:1,fn:()=>avg},'Константа');
  add(polyFit(pts,1),'Линейная');add(absFit(pts),'Модуль');add(expFit(pts),'Экспонента');
  add(polyFit(pts,2),'Квадратичная');add(polyFit(pts,3),'Кубическая');add(sineFit(pts),'Синусоида');
  for(let d=4;d<=6;d++)add(polyFit(pts,d),'Полином '+d);
  const best=Math.max(...cs.map(c=>c.r2));cs.sort((a,b)=>a.k-b.k);
  return cs.find(c=>c.r2>=Math.max(best-.03,best*.97))||cs[0];
}

/* ── значение модели, привязка к солдату и цели, округление ── */
function F(r,x){
  let v;
  switch(r.kind){
    case'poly':return r.c.reduceRight((u,q)=>u*x+q,0);
    case'sin':v=r.a*Math.sin(r.b*x+r.ph)+r.d;break;
    case'abs':v=r.a*Math.abs(x-r.h)+r.c;break;
    case'exp':v=r.a*Math.exp(r.b*x)+r.c;break;
    case'piece':return r.A+r.B*x+r.br.reduce((s,q)=>s+q.h*Math.abs(x-q.x),0);
  }
  return v+(r.lx||0)*x;
}
function addLin(r,a,b){ // r(x) += a + b*x, вшиваем в параметры модели
  if(r.kind==='poly'){while(r.c.length<2)r.c.push(0);r.c[0]+=a;r.c[1]+=b}
  else if(r.kind==='piece'){r.A+=a;r.B+=b}
  else{if(r.kind==='sin')r.d+=a;else r.c+=a;r.lx=(r.lx||0)+b}
}
function pinR(r,me,en){ // гарантированно проходим через солдата и цель
  const f=x=>F(r,x);let a,b=0;
  if(me&&en&&Math.abs(en.x-me.x)>.5){
    b=((en.y-f(en.x))-(me.y-f(me.x)))/(en.x-me.x);a=(me.y-f(me.x))-b*me.x;
  }else{const p=me||en;a=p.y-f(p.x)}
  addLin(r,a,b);
}
function roundR(r,n){
  const q=v=>Number(v.toPrecision(n)),o={...r};
  if(Array.isArray(o.c))o.c=o.c.map(q);else if(typeof o.c==='number')o.c=q(o.c);
  for(const k of['a','b','h','ph','d','A','B','lx'])if(typeof o[k]==='number')o[k]=q(o[k]);
  if(o.br)o.br=o.br.map(z=>({x:q(z.x),h:q(z.h)}));
  return o;
}
function cloneR(r){return{...r,c:Array.isArray(r.c)?[...r.c]:r.c,br:r.br?r.br.map(z=>({...z})):r.br}}
function fin(q){ // привязанные константы храним с 6 знаками после запятой
  const t=v=>Number(v.toFixed(6));
  if(q.kind==='poly'){q.c[0]=t(q.c[0]);if(q.c.length>1)q.c[1]=t(q.c[1])}
  else if(q.kind==='piece'){q.A=t(q.A);q.B=t(q.B)}
  else{if(q.kind==='sin')q.d=t(q.d);else q.c=t(q.c);if(q.lx)q.lx=t(q.lx)}
}
function okR(rr,r,pts,ends){ // округлённая формула не должна промахиваться
  for(const p of ends)if(p&&Math.abs(F(rr,p.x)-p.y)>.03)return false;
  return pts.every(p=>Math.abs(F(rr,p.x)-F(r,p.x))<.08);
}

/* ── строки уравнений ── */
function fmt(v){ // печатаем ровно то, что хранится (12 значащих), без обрезки до 5 знаков
  if(v===0)return'0';
  const dec=Math.min(30,Math.max(0,11-Math.floor(Math.log10(Math.abs(v)))));
  let s=v.toFixed(dec);if(s.includes('.'))s=s.replace(/0+$/,'').replace(/\.$/,'');
  return s==='-0'?'0':s;
}
function sum(parts){ // [[коэфф, тело], ...]
  let s='';
  for(const[v,b]of parts){
    const a=Math.abs(v);if(a<1e-12)continue;
    const t=b===''?fmt(a):Math.abs(a-1)<1e-7?b:fmt(a)+'*'+b;
    s+=s?(v<0?' - ':' + ')+t:(v<0?'-':'')+t;
  }
  return s||'0';
}
const sh=h=>h<0?' + '+fmt(-h):' - '+fmt(h);
function dForm(r,nd){ // правая часть уравнения dy/dx = ... (производная нашей функции)
  const rd=v=>nd>0?Number(v.toPrecision(nd)):v,sg=h=>`(x${sh(h)})/abs(x${sh(h)})`;
  if(r.kind==='poly')return sum(r.c.map((v,k)=>[rd(k*v),k===1?'':k===2?'x':'x^'+(k-1)]).slice(1).reverse());
  if(r.kind==='sin')return sum([[rd(r.a*r.b),`cos(${fmt(r.b)}*x${r.ph<0?' - ':' + '}${fmt(Math.abs(r.ph))})`],[rd(r.lx||0),'']]);
  if(r.kind==='exp')return sum([[rd(r.a*r.b),`exp(${fmt(r.b)}*x)`],[rd(r.lx||0),'']]);
  if(r.kind==='abs')return sum([[rd(r.a),sg(r.h)],[rd(r.lx||0),'']]);
  if(r.kind==='piece')return sum([[rd(r.B),''],...r.br.map(q=>[rd(q.h),sg(q.x)])]);
  return '0';
}
function odeCheck(txt,me,t){ // как решит игра: численно (шаг ≈ 1 пиксель игры), с начальным условием в точке бойца
  try{
    const js=txt.replace(/\^/g,'**').replace(/\b(sin|cos|exp)\(/g,'Math.$1(').replace(/\babs\(/g,'Math.abs(');
    const f=new Function('x','y','const v='+js+';return isFinite(v)?v:0');
    const dir=t.x>me.x?1:-1,h=.065*dir,n=Math.floor(Math.abs(t.x-me.x)/.065);let x=me.x,y=me.y;
    for(let i=0;i<n;i++){const k1=f(x,y),k2=f(x+h/2,y+h/2*k1),k3=f(x+h/2,y+h/2*k2),k4=f(x+h,y+h*k3);y+=h/6*(k1+2*k2+2*k3+k4);x+=h}
    const dl=y+f(x,y)*(t.x-x)-t.y;
    return 'ДУ-проверка: у цели Δ'+dl.toFixed(2)+(Math.abs(dl)>.5?' ⚠ слишком круто, игра может не попасть':'');
  }catch(e){return ''}
}
function gw(r){
  if(r.kind==='poly')return sum(r.c.map((v,k)=>[v,k===0?'':k===1?'x':'x^'+k]).reverse());
  if(r.kind==='sin')return sum([[r.a,`sin(${fmt(r.b)}*x${r.ph<0?' - ':' + '}${fmt(Math.abs(r.ph))})`],[r.lx||0,'x'],[r.d,'']]);
  if(r.kind==='abs')return sum([[r.a,`abs(x${sh(r.h)})`],[r.lx||0,'x'],[r.c,'']]);
  if(r.kind==='exp')return sum([[r.a,`exp(${fmt(r.b)}*x)`],[r.lx||0,'x'],[r.c,'']]);
  if(r.kind==='piece')return sum([[r.A,''],[r.B,'x'],...r.br.map(q=>[q.h,`abs(x${sh(q.x)})`])]);
}
function format(r){
  const g=gw(r),s=$('syn').value;
  if(s==='desmos')return 'y='+g;
  const conv=m=>g.replace(/\^/g,'**').replace(/\b(sin|exp)\(/g,m+'$1(').replace(/\babs\(/g,s==='py'?'abs(':'Math.abs(');
  if(s==='py')return 'import math\n\ndef f(x):\n    return '+conv('math.');
  if(s==='js')return 'const f = (x) => '+conv('Math.')+';';
  return $('nsp').checked?g.replace(/ /g,''):g;
}

/* ── препятствия: тёмные «толстые» области (оси и линии сетки тонкие — отсекаются) ── */
let MRG=null,DEADLINE=0; // DEADLINE — предел времени на поиск формы (мс) // временная подмена «запаса» (авто-уменьшение, если форма не проходит)
function thick(){
  if(S.thick)return S.thick;
  const{W,H}=S,d=S.data.data,N=W*H,dk=new Uint8Array(N);
  for(let i=0;i<N;i++){const j=i*4;dk[i]=Math.max(d[j],d[j+1],d[j+2])<70?1:0}
  const c=cal(),T=Math.max(6,Math.round(.35*Math.min(c.sx,c.sy))),hr=new Uint16Array(N),vr=new Uint16Array(N);
  for(let y=0;y<H;y++){let x=0;while(x<W){if(!dk[y*W+x]){x++;continue}let e=x;while(e<W&&dk[y*W+e])e++;for(let k=x;k<e;k++)hr[y*W+k]=e-x;x=e}}
  for(let x=0;x<W;x++){let y=0;while(y<H){if(!dk[y*W+x]){y++;continue}let e=y;while(e<H&&dk[e*W+x])e++;for(let k=y;k<e;k++)vr[k*W+x]=e-y;y=e}}
  const th=new Uint8Array(N);for(let i=0;i<N;i++)th[i]=hr[i]>=T&&vr[i]>=T?1:0;
  return S.thick=th;
}
function obsGrid(){ // сетка 0.25 клетки: occ — препятствие, plan — с запасом для планировщика, chk — с половинным запасом для проверки
  const c=cal(),m=MRG!=null?MRG:+$('mrg').value,key=[c.l,c.t,c.r,c.b].map(v=>v.toFixed(1))+','+m+'|'+othSig();
  if(S.og&&S.og.key===key)return S.og;
  const d=.25,NX=Math.round(FX()/d),NY=Math.round(FY()/d),th=thick(),W=S.W,cw=d*c.sx,ch=d*c.sy,cnt=new Int32Array(NX*NY);
  for(let y=Math.max(0,Math.ceil(c.t));y<Math.min(S.H,c.b);y++){
    const j=Math.min(NY-1,Math.floor((y-c.t)/ch));
    for(let x=Math.max(0,Math.ceil(c.l));x<Math.min(W,c.r);x++)if(th[y*W+x])cnt[j*NX+Math.min(NX-1,Math.floor((x-c.l)/cw))]++;
  }
  const occ=new Uint8Array(NX*NY);for(let k=0;k<occ.length;k++)occ[k]=cnt[k]>.25*cw*ch?1:0;
  for(const q of S.cand){ // остальные бойцы и роботы — тоже препятствия: выстрел может задеть и своих
    if(sameP(q,S.me)||S.ens.some(e=>sameP(e,q)))continue;
    const gx=(q.x-c.l)/cw,gy=(q.y-c.t)/ch,R=.7/d;
    for(let j=Math.max(0,Math.floor(gy-R));j<=Math.min(NY-1,Math.ceil(gy+R));j++)for(let i=Math.max(0,Math.floor(gx-R));i<=Math.min(NX-1,Math.ceil(gx+R));i++)if(Math.hypot(i+.5-gx,j+.5-gy)<=R)occ[j*NX+i]=1;
  }
  const infl=r=>{const o=new Uint8Array(NX*NY),R=Math.ceil(r/d);
    for(let j=0;j<NY;j++)for(let i=0;i<NX;i++)if(occ[j*NX+i])
      for(let dj=-R;dj<=R;dj++)for(let di=-R;di<=R;di++){
        if(di*di+dj*dj>R*R+.5)continue;const a=i+di,b=j+dj;if(a>=0&&a<NX&&b>=0&&b<NY)o[b*NX+a]=1}
    return o};
  return S.og={key,d,NX,NY,occ,plan:infl(m),chk:infl(m/2)};
}
function drawObs(c){
  const g=obsGrid(),w=g.d*c.sx,h=g.d*c.sy;
  for(let j=0;j<g.NY;j++)for(let i=0;i<g.NX;i++){const k=j*g.NX+i;
    if(g.plan[k]){cx.fillStyle=g.occ[k]?'rgba(255,140,0,.55)':'rgba(255,200,0,.22)';cx.fillRect(c.l+i*w,c.t+j*h,w+.5,h+.5)}}
}
function planPath(wp){ // wp: точки в координатах поля от центра, первая — солдат. Поиск по столбцам (y — функция от x) с вертикальными участками
  const g=obsGrid(),{d,NX,NY,occ}=g,X=FX(),Y=FY(),EM=.03;
  const ck=wp.map(p=>p.x.toFixed(2)+','+p.y.toFixed(2)).join(';')+'|'+g.key;
  if(S.pk===ck)return S.pr; // тот же расчёт — берём из кеша
  const col=x=>Math.floor((x+X/2)/d),row=y=>Math.floor((Y/2-y)/d);
  const me=wp[0],far=wp.slice(1).reduce((a,b)=>Math.abs(b.x-me.x)>Math.abs(a.x-me.x)?b:a);
  const dir=far.x>me.x?1:-1,i0=col(me.x);
  let W=wp.map(p=>({t:(col(p.x)-i0)*dir,j:row(p.y),p})).filter((w,i)=>i===0||w.t>0).sort((a,b)=>a.t-b.t);
  W=W.filter((w,i)=>i===0||w.t>W[i-1].t);
  const T=W[W.length-1].t;if(W.length<2||T<2)return'враг слишком близко к солдату по X';
  const plan=g.plan.slice();
  for(const w of W){const i=i0+dir*w.t;for(let dj=-4;dj<=4;dj++)for(let di=-4;di<=4;di++){
    const a=i+di,b=w.j+dj;if(a>=0&&a<NX&&b>=0&&b<NY&&!occ[b*NX+a])plan[b*NX+a]=0}}
  const SL=3,NK=2*SL+1,rowAt=new Int32Array(T+1).fill(-1);W.forEach(w=>rowAt[w.t]=w.j);
  const blk=(t,j)=>{const i=i0+dir*t;return j<1||j>=NY-1||i<0||i>=NX||plan[j*NX+i]===1};
  const free=(t,j)=>rowAt[t]>=0?j===rowAt[t]:!blk(t,j);
  const SZ=(T+1)*NY*NK,cost=new Float32Array(SZ).fill(Infinity),prev=new Int32Array(SZ).fill(-1),id=(t,j,k)=>(t*NY+j)*NK+k;
  for(let k=0;k<NK;k++)cost[id(0,W[0].j,k)]=0;
  for(let t=0;t<=T;t++){
    if(t===0||rowAt[t]<0){ // вертикальный участок внутри столбца: от любой достижимой строки вверх/вниз по свободным клеткам
      const b=new Float32Array(NY).fill(Infinity),src=new Int32Array(NY).fill(-1);
      for(let j=0;j<NY;j++)for(let k=0;k<NK;k++){const c=cost[id(t,j,k)];if(c<b[j]){b[j]=c;src[j]=id(t,j,k)}}
      const dv=Float32Array.from(b,v=>v+2),ds=Int32Array.from(src);
      for(let j=1;j<NY;j++)if(!blk(t,j)&&!blk(t,j-1)&&dv[j-1]+1<dv[j]){dv[j]=dv[j-1]+1;ds[j]=ds[j-1]}
      for(let j=NY-2;j>=0;j--)if(!blk(t,j)&&!blk(t,j+1)&&dv[j+1]+1<dv[j]){dv[j]=dv[j+1]+1;ds[j]=ds[j+1]}
      for(let j=0;j<NY;j++)if(dv[j]<b[j]&&ds[j]>=0&&!blk(t,j)){cost[id(t,j,SL)]=dv[j];prev[id(t,j,SL)]=ds[j]}
    }
    if(t===T)break;
    for(let j=0;j<NY;j++)for(let k=0;k<NK;k++){
      const c0=cost[id(t,j,k)];if(c0===Infinity)continue;const s=k-SL;
      for(let k2=0;k2<NK;k2++){
        const s2=k2-SL,j2=j+s2;if(j2<0||j2>=NY||!free(t+1,j2))continue;
        let ok=true;for(let r=Math.min(j,j2)+1;r<Math.max(j,j2);r++)if(blk(t+1,r)){ok=false;break}
        if(!ok)continue;
        const nc=c0+Math.sqrt(1+s2*s2)+.6*(s2-s)*(s2-s),q=id(t+1,j2,k2);
        if(nc<cost[q]){cost[q]=nc;prev[q]=id(t,j,k)}
      }
    }
  }
  const jl=W[W.length-1].j;let bq=-1,bc=Infinity;
  for(let k=0;k<NK;k++){const c=cost[id(T,jl,k)];if(c<bc){bc=c;bq=id(T,jl,k)}}
  if(bq<0)return'путь не найден — уменьши «запас» или проверь препятствия (кнопка «🧱 Препятствия»)';
  const st=[];for(let q=bq;q>=0;q=prev[q])st.push(q);st.reverse();
  const pts=st.map(q=>{const t=(q/(NY*NK))|0,j=((q/NK)|0)%NY,i=i0+dir*t;return{t,x:-X/2+(i+.5)*d,y:Y/2-(j+.5)*d}});
  const ks=[];pts.forEach((p,i)=>{const w=W.find(w=>w.t===p.t);if(w){p.x=w.p.x;p.y=w.p.y;ks.push(i)}});
  const simp=tol=>{let o=[pts[0]];for(let q=1;q<ks.length;q++)o=o.concat(rdpP(pts.slice(ks[q-1],ks[q]+1),tol).slice(1));return o};
  const nw=(x,y)=>W.some(w=>Math.hypot(x-w.p.x,y-w.p.y)<.8);
  const clear=v=>{for(let a=0;a<v.length-1;a++){
    const p=v[a],q=v[a+1],n=Math.max(1,Math.ceil(Math.hypot(q.x-p.x,q.y-p.y)/(d/2)));
    for(let u=0;u<=n;u++){const x=p.x+(q.x-p.x)*u/n,y=p.y+(q.y-p.y)*u/n,i=Math.floor((x+X/2)/d),jj=Math.floor((Y/2-y)/d);
      if(jj<0||jj>=NY||i<0||i>=NX)return false;if(g.chk[jj*NX+i]&&!nw(x,y))return false}}return true};
  let best=null;
  for(const tol of[0,.1,.2,.35,.5,.75,1,1.5,2.5]){const v=simp(tol);if(clear(v))best=v;else if(best)break}
  const v=(best||simp(0)).map(p=>({x:p.x,y:p.y}));
  for(let i=1;i<v.length;i++)if((v[i].x-v[i-1].x)*dir<EM)v[i].x=v[i-1].x+dir*EM;   // вертикаль → очень крутой отрезок
  S.pk=ck;return S.pr={v:v.sort((a,b)=>a.x-b.x),used:W.length-1};
}
function pieceFromVerts(v){
  const sl=[];for(let i=0;i<v.length-1;i++)sl.push((v[i+1].y-v[i].y)/((v[i+1].x-v[i].x)||1e-9));
  const br=[];for(let i=1;i<sl.length;i++)br.push({x:v[i].x,h:(sl[i]-sl[i-1])/2});
  const B=sl[0]+br.reduce((s,q)=>s+q.h,0),x0=v[0].x;
  const A=v[0].y-B*x0-br.reduce((s,q)=>s+q.h*Math.abs(x0-q.x),0);
  return{kind:'piece',A,B,br,k:2+br.length,fn:x=>A+B*x+br.reduce((s,q)=>s+q.h*Math.abs(x-q.x),0)};
}

/* ── «Арка»: форма со скриншота — горка, вертикаль вверх, арка с врагом на вершине, вертикаль вниз, горка, ровная линия.
   Параметры подбираются перебором так, чтобы не задевать препятствия; вершина арки точно в центре врага ── */
function pathClear(v,g,ex){
  const{d,NX,NY,plan}=g,X=FX(),Y=FY();
  for(let a=0;a<v.length-1;a++){
    const p=v[a],q=v[a+1],n=Math.max(1,Math.ceil(Math.hypot(q.x-p.x,q.y-p.y)/(d/2)));
    for(let u=0;u<=n;u++){
      const x=p.x+(q.x-p.x)*u/n,y=p.y+(q.y-p.y)*u/n,i=Math.floor((x+X/2)/d),j=Math.floor((Y/2-y)/d);
      if(j<0||j>=NY||i<0||i>=NX)return false;
      if(plan[j*NX+i]&&!ex.some(w=>Math.hypot(x-w.x,y-w.y)<.8))return false;
    }
  }
  return true;
}
function planTowerCore(me,en){ // me, en — в координатах поля от центра
  /* Шаблон измерен по пикселям скриншота с видео. Фигура рисуется ЦЕЛИКОМ (горка, вертикаль, арка с засечкой, вертикаль, горка),
     форма не меняется — только масштаб (одинаковый по x и y), высота линии основания и положение. После фигуры идёт прямая во врага. */
  const g=obsGrid(),X=FX(),Y=FY(),EM=.03,tolPx=Math.max(.15,+$('pt').value*.15);
  const ck=[me.x,me.y,en.x,en.y].map(v=>v.toFixed(2))+'|'+tolPx+'|'+g.key;
  if(S.tk===ck)return S.tr;
  const TP={cx:809.5,base:1010.5,px:28.32,notchY:352,L:[[500.0,1010.5],[504.0,1008.0],[505.5,993.0],[512.0,977.0],[520.5,962.0],[529.0,952.0],[545.0,937.0],[561.0,927.0],[568.0,925.5],[574.0,922.5],[582.0,921.5],[589.0,918.0],[598.0,917.0],[619.0,917.0],[628.0,921.5],[636.0,922.5],[648.0,926.5],[659.0,932.5],[677.0,946.0],[694.0,968.5],[700.0,971.0],[702.5,969.5],[704.0,967.0],[705.0,960.0],[705.0,788.0],[708.0,773.0],[708.0,355.0],[709.0,350.0],[713.0,341.0],[714.0,326.0],[713.0,304.0],[718.0,292.0],[728.0,277.0],[734.0,270.0],[750.0,255.5],[766.0,246.5],[779.0,241.5],[797.0,241.0],[802.0,242.5],[806.0,241.0]]};
  const dir=en.x>me.x?1:-1;
  const half=rdpP(TP.L.map(([x,y])=>({x,y})),tolPx).map(p=>({u:(p.x-TP.cx)/TP.px,v:(TP.base-p.y)/TP.px}));
  const T=[...half,{u:0,v:(TP.base-TP.notchY)/TP.px},...half.slice().reverse().map(p=>({u:-p.u,v:p.v}))];
  const u0=T[0].u,u1=T[T.length-1].u,Wd=u1-u0,vtop=Math.max(...T.map(p=>p.v));
  const dx=(en.x-me.x)*dir,ex=[me,en],Lmin=Math.max(.5,Math.min(1.5,dx*.3));
  const build=(k,s,yb,X0)=>{
    const mx=u=>X0+dir*(u-u0)*k,my=v=>yb+s*v*k;
    const v=[{x:me.x,y:me.y}];if(Math.abs(yb-me.y)>1e-6)v.push({x:me.x+dir*EM,y:yb});
    if((X0-v[v.length-1].x)*dir<.25)return null;
    const first=v.length;
    for(const p of T)v.push({x:mx(p.u),y:my(p.v)});
    const iEnd=v.length-1;
    if((en.x-v[iEnd].x)*dir<Lmin)return null;
    v.push({x:en.x,y:en.y});
    for(let i=1;i<v.length;i++)if((v[i].x-v[i-1].x)*dir<EM)v[i].x=v[i-1].x+dir*EM;
    if((en.x-v[iEnd].x)*dir<Lmin-.3)return null;
    if(v.some(p=>Math.abs(p.y)>Y/2-.15||Math.abs(p.x)>X/2+.05))return null;
    return{v,first,iEnd,k,s,yb,X0};
  };
  const cand=(k,s)=>{ // все положения фигуры при масштабе k: высота основания yb, начало X0
    const out=[],lo=me.x+dir*.25,hi=en.x-dir*(Lmin+Wd*k+.1),span=(hi-lo)*dir;if(span<0)return out;
    const nx=Math.min(24,Math.ceil(span/.8)+1),xs=[];for(let i=0;i<nx;i++)xs.push(lo+dir*span*(nx>1?i/(nx-1):0));
    {const a=s>0?-Y/2+.5:-Y/2+.3+vtop*k,b=s>0?Y/2-.3-vtop*k:Y/2-.5;
      for(let yb=a;yb<=b+1e-9;yb+=.5)for(const X0 of xs)out.push({s,yb,X0})}
    return out;
  };
  const cost=c=>{const X1=c.v[c.iEnd].x;return Math.abs(en.y-c.yb)/(Math.abs(en.x-X1)||1)+.02*Math.abs(c.yb-me.y)};
  const fin=(c,lead,conn)=>({v:c.v.slice().sort((a,b)=>a.x-b.x),used:1,tag:` (форма 1:1, масштаб ${c.k.toFixed(2)}${c.s<0?', перевёрнута':''}, затем прямая до врага${lead?', подход к форме обходом':''}${conn?', линия до врага обходом':''})`});
  const ks=[];for(let k=1;k>.02;k*=.9)ks.push(k);
  const dq=[];
  for(const s of[1,-1])                                      // сначала только прямая форма (как на видео), перевёрнутая — в крайнем случае
    for(const k of ks){                                      // от крупного масштаба к мелкому
      if(Date.now()>DEADLINE)break;
      let best=null,bc=Infinity,n=0;
      for(const p of cand(k,s)){
        const c=build(k,s,p.yb,p.X0);if(!c)continue;
        if(pathClear(c.v,g,ex)){const w=cost(c);if(w<bc){bc=w;best=c}if(++n>=60)break}
        else if(dq.length<8&&s>0&&pathClear(c.v.slice(c.first,c.iEnd+1),g,ex))dq.push(c);   // сама фигура чистая, мешает подход или линия
      }
      if(best)return S.tr=(S.tk=ck,fin(best,false,false));
    }
  let dpN=0;
  for(const c of dq){                                       // подход и/или линию до врага прокладываем обходом
    if(dpN>=6||Date.now()>DEADLINE)break;
    const lead=c.v.slice(0,c.first),shape=c.v.slice(c.first,c.iEnd+1);
    let a=lead,b=[{x:en.x,y:en.y}],ld=false,cn=false;
    if(!pathClear(lead.concat(shape[0]),g,ex)){dpN++;const r=planPath([me,shape[0]]);if(typeof r==='string')continue;a=(dir>0?r.v:r.v.slice().reverse()).slice(0,-1);ld=true}
    if(!pathClear([shape[shape.length-1],{x:en.x,y:en.y}],g,ex)){dpN++;const r=planPath([shape[shape.length-1],en]);if(typeof r==='string')continue;b=(dir>0?r.v:r.v.slice().reverse()).slice(1);cn=true}
    const v=a.concat(shape,b);
    for(let i=1;i<v.length;i++)if((v[i].x-v[i-1].x)*dir<EM)v[i].x=v[i-1].x+dir*EM;
    if(pathClear(v,g,ex))return S.tr=(S.tk=ck,fin({v,k:c.k,s:c.s},ld,cn));
  }
  const r=planPath([me,en]);
  if(typeof r!=='string')return S.tr=(S.tk=ck,{v:r.v,used:1,tag:' (форма не поместилась на этой карте — построен обычный обход)'});
  return'путь к врагу перекрыт препятствиями: уменьши «запас» или проверь маркеры';
}
function planTower(me,en){
  const base=+$('mrg').value,key=[me.x,me.y,en.x,en.y].map(v=>v.toFixed(2))+'|'+base+'|'+$('pt').value+'|'+othSig()+'|'+(S.og?S.og.key:'');
  if(S.tw===key)return S.twr;
  let plain=null,err=null,res=null;DEADLINE=Date.now()+4000;
  for(const m of base>.12?[base,base*.6,base*.3,.1,.03]:[base]){
    if(Date.now()>DEADLINE&&(plain||res))break;
    MRG=m;S.pk=null;let r;
    try{const pp=planPath([me,en]);r=typeof pp==='string'?pp:planTowerCore(me,en)}finally{MRG=null}   // нет даже обычного пути — форму можно не искать
    if(typeof r==='string'){err=r;continue}
    if(!r.tag.includes('обычный обход')){res=m<base?{...r,tag:r.tag+`, запас уменьшен до ${m.toFixed(2)}`}:r;break}
    if(!plain)plain=r;
  }
  res=res||plain||err;S.tw=key;S.twr=res;return res;
}
/* ── «Как нарисовано»: повторяет линию пальца, включая почти вертикальные участки ── */
function rdpP(pts,tol){ // упрощение по перпендикулярному расстоянию (вертикали не ломаются)
  const n=pts.length;if(n<3)return pts.slice();
  const keep=new Uint8Array(n);keep[0]=keep[n-1]=1;const st=[[0,n-1]];
  while(st.length){const[i,j]=st.pop(),A=pts[i],B=pts[j],dx=B.x-A.x,dy=B.y-A.y,L=Math.hypot(dx,dy)||1e-9;let md=0,mi=-1;
    for(let k=i+1;k<j;k++){const d=Math.abs((pts[k].x-A.x)*dy-(pts[k].y-A.y)*dx)/L;if(d>md){md=d;mi=k}}
    if(md>tol&&mi>0){keep[mi]=1;st.push([i,mi],[mi,j])}}
  return pts.filter((_,i)=>keep[i]);
}
function traceVerts(){
  const E=.07; // минимальный шаг по x: вертикаль становится очень крутым отрезком (~1 пиксель игры)
  const mono=a=>{const o=[];for(const p of a){const l=o[o.length-1];o.push({x:l&&p.x<l.x+E?l.x+E:p.x,y:p.y})}return o};
  const ss=S.strokes.map(s=>{const g=s.map(toG);return g[g.length-1].x<g[0].x?g.reverse():g}).sort((a,b)=>a[0].x-b[0].x);
  const raw=[];for(const g of ss)for(const p of g){const l=raw[raw.length-1];if(!l||Math.hypot(p.x-l.x,p.y-l.y)>.03)raw.push({x:p.x,y:p.y})}
  if(raw.length<2)return raw;
  let v=mono(rdpP(raw,+$('pt').value/80));
  const wp=[S.me?toG(S.me):null,...S.ens.map(toG)].filter(Boolean);
  for(const w of wp){ // если линия проходит рядом с солдатом/врагом — прибиваем вершину точно к нему
    if(w.x<v[0].x-1||w.x>v[v.length-1].x+1)continue;
    let ya=w.x>v[v.length-1].x?v[v.length-1].y:v[0].y;
    for(let i=0;i<v.length-1;i++)if(w.x>=v[i].x&&w.x<=v[i+1].x)ya=v[i].y+(w.x-v[i].x)/((v[i+1].x-v[i].x)||1)*(v[i+1].y-v[i].y);
    if(Math.abs(ya-w.y)>1.2)continue;
    v=v.filter(p=>Math.abs(p.x-w.x)>=.15);v.push({x:w.x,y:w.y});v.sort((a,b)=>a.x-b.x);v=mono(v);
  }
  return v;
}

/* ── подгонка ── */
function points(){
  const m=new Map();
  for(const s of S.strokes)for(const p of s){
    const g=toG(p),k=Math.round(g.x*25);let e=m.get(k);if(!e){e={s:0,n:0};m.set(k,e)}e.s+=g.y;e.n++;
  }
  return[...m].map(([k,e])=>({x:k/25,y:e.s/e.n})).sort((a,b)=>a.x-b.x);
}
function refit(){
  S.gwText='';
  if(['path','tower'].includes($('mod').value)&&(S.drag||S.tap))return; // не планируем на каждое движение пальца
  S.fit=null;
  if(!cal()){show('— (отметь поле)');return}
  const m=$('mod').value;let pts,r,lab='';
  if(m==='tower'){
    if(!S.me||S.ens.length!==1){show('— (модель для случая, когда остался один враг: отметь себя и одного врага)');return}
    const c=cal(),o=off(c),res=planTower(fieldXY(S.me,c),fieldXY(S.ens[0],c));
    if(typeof res==='string'){show('— ('+res+')');return}
    r=pieceFromVerts(res.v.map(p=>({x:p.x-o.x,y:p.y-o.y})));
    pts=[];for(let x=res.v[0].x-o.x;x<=res.v[res.v.length-1].x-o.x;x+=.05)pts.push({x,y:F(r,x)});
    lab='Арка: '+(res.v.length-1)+' отрезков'+res.tag;
  }else if(m==='trace'){
    if(!S.strokes.length){show('— (нарисуй линию)');return}
    const vs=traceVerts();if(vs.length<2){show('— (линия слишком короткая)');return}
    r=pieceFromVerts(vs);pts=[];for(let x=vs[0].x;x<=vs[vs.length-1].x;x+=.05)pts.push({x,y:F(r,x)});
    lab='Как нарисовано: '+(vs.length-1)+' отрезков';
  }else if(m==='path'){
    if(!S.me||!S.ens.length){show('— (отметь себя и хотя бы одного врага)');return}
    const c=cal(),o=off(c),res=planPath([S.me,...S.ens].map(p=>fieldXY(p,c)));
    if(typeof res==='string'){show('— ('+res+')');return}
    r=pieceFromVerts(res.v.map(p=>({x:p.x-o.x,y:p.y-o.y})));
    pts=[];for(let x=res.v[0].x-o.x;x<=res.v[res.v.length-1].x-o.x;x+=.5)pts.push({x,y:F(r,x)});
    lab='Авто-путь: '+(res.v.length-1)+' отрезков, врагов '+res.used+(res.used<S.ens.length?' (остальные позади — пропущены)':'');
  }else{
    pts=points();if(pts.length<6){show('— (нарисуй линию)');return}
    if(m==='short'){r=shortest(pts);lab=r.label+' ('+r.k+' парам.)'}
    else if(m==='piece')r=pieceFit(pts,+$('pt').value/20);
    else if(m==='poly')r=polyFit(pts,+$('deg').value);
    else if(m==='sin')r=sineFit(pts);else r=expFit(pts);
    if(!r){show('— (не удалось)');return}
  }
  const me=S.me?toG(S.me):null,eg=S.ens.map(toG),ox=me?me.x:0;
  const en=eg.slice().sort((p,q)=>Math.abs(q.x-ox)-Math.abs(p.x-ox))[0]||null; // самый дальний враг
  const lineM=m==='path'||m==='trace'||m==='tower'; // эти модели строят кривую сами и уже проходят через точки
  const pin=$('pin').checked&&!lineM&&!!(me||en);
  const base=r,ref=pin?(q=>{pinR(q,me,en);return q})(cloneR(base)):base; // ref — идеальная кривая без округления
  const ends=pin?[me,en]:lineM?[me,...eg].filter(p=>p&&Math.abs(F(base,p.x)-p.y)<.05):[];
  const build=n=>{const q=n>0?roundR(base,n):cloneR(base);
    const ok=p=>!p||Math.abs(F(q,p.x)-p.y)<.05;
    if(pin||(lineM&&ok(me)&&ok(en)))pinR(q,me,en);fin(q);return q}; // округляем модель, потом привязываем заново
  const okN=q=>ends.every(p=>!p||Math.abs(F(q,p.x)-p.y)<=.005)&&pts.every(p=>Math.abs(F(q,p.x)-F(ref,p.x))<.05);
  let n=$('prec').value,used='все';
  if(n==='auto'){for(let k=2;k<=9;k++){r=build(k);used=k;if(okN(r))break}}
  else{r=build(+n);if(+n>0)used=n}
  S.fit=x=>F(r,x);S.gwText=gw(r).replace(/ /g,'');
  let dtxt='';
  if(S.ode){dtxt=dForm(r,/^\d+$/.test(String(used))?+used:0);S.gwText=dtxt.replace(/ /g,'')}
  const inf=[];
  try{const ft=new Function('x','return '+gw(r).replace(/\^/g,'**').replace(/\b(sin|exp)\(/g,'Math.$1(').replace(/\babs\(/g,'Math.abs('));
    let w=0;for(const p of pts)w=Math.max(w,Math.abs(ft(p.x)-F(r,p.x)));inf.push('текст=модель Δ'+w.toFixed(4))}catch(e){}
  if(pin||lineM){if(me)inf.push('я Δ'+(F(r,me.x)-me.y).toFixed(2));eg.forEach((g,i)=>inf.push('враг'+(i+1)+' Δ'+(F(r,g.x)-g.y).toFixed(2)))}
  if(S.ode&&me){const oc=odeCheck(dtxt,me,en||eg[0]||me);if(oc)inf.push(oc)}
  show(S.ode?'dy/dx = '+dtxt:format(r),r2(pts,S.fit),[lab,inf.length?'через: '+inf.join(', '):'','цифр: '+used].filter(Boolean).join(' · '));
}
let cur='';
function show(t,r,lab){
  if(GWM){const gi=document.getElementById('gwinfo');if(gi)gi.textContent=t.startsWith('—')?t.replace(/^— ?\(?/,'').replace(/\)$/,''):((lab||'')+' · '+(S.gwText?S.gwText.length+' симв.':''));gwSync()}
  cur=t;$('eqv').textContent=t;
  $('r2').textContent=(lab?lab+'  ':'')+(typeof r==='number'?'R² = '+r.toFixed(4):'');
  typing();
}
function typing(){ // формулу нельзя вставить в игру — показываем крупными кусками для ручного набора
  const p=$('tp');if(p.hidden)return;
  const t=cur.startsWith('—')?'':cur.replace(/\s+/g,'');
  p.innerHTML=`<div style="color:var(--mu);margin-bottom:6px">${t.length} символов · набирай кусок за куском, нажимай на набранный</div>`;
  const parts=t.split(/(?=[+\-])/),ch=[];let c='';
  for(const q of parts){if(c&&(c+q).length>14){ch.push(c);c=''}c+=q;while(c.length>20){ch.push(c.slice(0,16));c=c.slice(16)}}
  if(c)ch.push(c);
  for(const x of ch){const b=document.createElement('button');b.textContent=x;
    b.style.cssText='font:700 20px ui-monospace,Consolas,monospace;margin:3px;padding:10px 12px;text-transform:none';
    b.onclick=()=>b.classList.toggle('on');p.appendChild(b)}
}
$('tb').onclick=()=>{$('tp').hidden=!$('tp').hidden;typing()};
$('cp').onclick=async()=>{
  if(cur.startsWith('—'))return;
  try{await navigator.clipboard.writeText(cur)}catch(_){const a=document.createElement('textarea');a.value=cur;document.body.appendChild(a);a.select();document.execCommand('copy');a.remove()}
  $('cp').textContent='✓ Скопировано';setTimeout(()=>$('cp').textContent='📋 Скопировать',1500);
};

/* ── UI ── */
const upd=()=>{refit();redraw()};
['fx','fy','org','syn','deg','pt','pin','prec','nsp','mrg'].forEach(i=>$(i).addEventListener('input',upd));
$('mod').onchange=()=>{$('dg').hidden=$('mod').value!=='poly';$('tg').hidden=!['piece','trace','tower'].includes($('mod').value);upd()};
addEventListener('resize',draw);
$('mode').addEventListener('change',draw);
function nudge(dx,dy){
  const k=$('ns').value,q=getP(k);if(!q){msg('Этот маркер ещё не отмечен','wa');return}
  const st=+$('nst').value;setP(k,{x:q.x+dx*st,y:q.y+dy*st});
  S.lp=k;clearTimeout(S.lt);S.lt=setTimeout(()=>{S.lp=null;redraw()},1500);upd();
}
$('nl').onclick=()=>nudge(-1,0);$('nrr').onclick=()=>nudge(1,0);$('nu').onclick=()=>nudge(0,-1);$('nd').onclick=()=>nudge(0,1);
$('fh').onclick=()=>{const c=cal();if(!c)return;S.p1={x:c.l,y:c.t};S.p2={x:c.r,y:c.t+(c.r-c.l)*FY()/FX()};upd()};
$('fw').onclick=()=>{const c=cal();if(!c)return;S.p1={x:c.l,y:c.t};S.p2={x:c.l+(c.b-c.t)*FX()/FY(),y:c.b};upd()};
$('grid').onclick=()=>{S.grid=!S.grid;$('grid').classList.toggle('on',S.grid);redraw()};
$('obs').onclick=()=>{S.showObs=!S.showObs;$('obs').classList.toggle('on',S.showObs);redraw()};
$('dele').onclick=()=>{S.ens.pop();syncNs();upd()};
$('undo').onclick=()=>{S.strokes.pop();upd()};
$('clr').onclick=()=>{S.strokes=[];S.cur=null;upd()};
/* ── режим приложения: снимок экрана, поиск бойцов и врагов, панель ── */
const GWM=typeof window.GW!=='undefined'&&window.GW!==null;
const sameP=(a,b)=>!!a&&!!b&&Math.hypot(a.x-b.x,a.y-b.y)<4;
function morphBox(m,w,h,r,dil){ // расширение (dil=1) или сжатие (dil=0) квадратом на r пикселей
  const t=new Uint8Array(w*h),o=new Uint8Array(w*h),edge=dil?0:1;
  for(let y=0;y<h;y++)for(let x=0;x<w;x++){let v=edge?1:0;
    for(let k=-r;k<=r;k++){const xx=x+k,b=xx>=0&&xx<w?m[y*w+xx]:edge;if(dil?b:!b){v=dil?1:0;break}}t[y*w+x]=v}
  for(let y=0;y<h;y++)for(let x=0;x<w;x++){let v=edge?1:0;
    for(let k=-r;k<=r;k++){const yy=y+k,b=yy>=0&&yy<h?t[yy*w+x]:edge;if(dil?b:!b){v=dil?1:0;break}}o[y*w+x]=v}
  return o;
}
function othSig(){return S.cand.filter(q=>!sameP(q,S.me)&&!S.ens.some(e=>sameP(e,q))).map(q=>(q.x|0)+','+(q.y|0)).join(';')}
function detectSprites(){ // люди: зелёная каска + жёлтое лицо; роботы: серая голова; мишени: синее кольцо с красной точкой
  const c=cal();if(!c)return[];
  const W=S.W,H=S.H,d=S.data.data,x0=Math.max(0,Math.ceil(c.l)),y0=Math.max(0,Math.ceil(c.t)),w=Math.min(W,Math.floor(c.r))-x0,h=Math.min(H,Math.floor(c.b))-y0;
  if(w<50||h<50)return[];
  const sc=(c.sx+c.sy)/2,minP=.47*sc,maxP=2.03*sc,hum=new Uint8Array(w*h),rob=new Uint8Array(w*h),blu=new Uint8Array(w*h),red=new Uint8Array(w*h);
  for(let y=0;y<h;y++)for(let x=0;x<w;x++){
    const i=((y+y0)*W+x+x0)*4,r=d[i],g=d[i+1],b=d[i+2],mx=Math.max(r,g,b),k=y*w+x;
    if((r<45&&g>45&&g>b+30)||(r>180&&g>140&&b<90&&r-b>100))hum[k]=1;
    else if(Math.abs(r-g)<12&&Math.abs(g-b)<14&&mx>=70&&mx<=150)rob[k]=1;
    if(b>150&&r<80&&g<80)blu[k]=1;
    if(r>180&&g<80&&b<80)red[k]=1;
  }
  const out=[];
  for(const[mask,kind]of[[hum,'h'],[rob,'r'],[blu,'t']]){
    const m=morphBox(morphBox(mask,w,h,2,1),w,h,2,0),seen=new Uint8Array(w*h);
    for(let s0=0;s0<w*h;s0++){
      if(!m[s0]||seen[s0])continue;
      let n=0,mnx=w,mxx=0,mny=h,mxy=0;const st=[s0];seen[s0]=1;
      while(st.length){
        const q=st.pop(),x=q%w,y=(q/w)|0;n++;
        if(x<mnx)mnx=x;if(x>mxx)mxx=x;if(y<mny)mny=y;if(y>mxy)mxy=y;
        for(let dy=-1;dy<=1;dy++)for(let dx=-1;dx<=1;dx++){const xx=x+dx,yy=y+dy;if(xx<0||yy<0||xx>=w||yy>=h)continue;const k=yy*w+xx;if(m[k]&&!seen[k]){seen[k]=1;st.push(k)}}
      }
      const bw=mxx-mnx+1,bh=mxy-mny+1,tg=kind==='t';
      if(!(bw>=minP&&bw<=maxP&&bh>=minP&&bh<=maxP&&n>=(tg?.1:.4)*bw*bh&&n>=(tg?.04:.137)*sc*sc&&bw/bh>=.6&&bw/bh<=1.6))continue;
      if(tg){ // в центре кольца должна быть красная точка
        let rc=0;const cx0=mnx+bw/2,cy0=mny+bh/2,rr=Math.max(3,.3*Math.min(bw,bh));
        for(let yy=Math.floor(cy0-rr);yy<=cy0+rr;yy++)for(let xx=Math.floor(cx0-rr);xx<=cx0+rr;xx++)if(xx>=0&&yy>=0&&xx<w&&yy<h&&red[yy*w+xx])rc++;
        if(rc<6)continue;
      }
      out.push({x:x0+mnx+bw/2,y:y0+mny+bh/2,kind});
    }
  }
  out.sort((a,b)=>a.x-b.x||a.y-b.y);out.forEach((q,i)=>q.n=i+1);return out;
}
function afterShot(){ // после снимка: поле, препятствия и участники находятся сами
  const b=fieldBox({x:S.W/2,y:S.H/2});
  if(!b){msg('Поле не найдено: открой игру с полем и нажми «Анализ» снова','wa');refit();redraw();return}
  S.p1={x:b.x0,y:b.y0};S.p2={x:b.x1,y:b.y1};
  S.cand=detectSprites();
  const hs=S.cand.filter(q=>q.kind==='h');
  if(hs.length===1){S.me={x:hs[0].x,y:hs[0].y};const o=S.cand.filter(q=>q!==hs[0]);if(o.length===1)S.ens=[{x:o[0].x,y:o[0].y}]}
  $('mode').value='pick';syncNs();autoModel();
  const nh=S.cand.filter(q=>q.kind==='h').length,nr=S.cand.filter(q=>q.kind==='r').length,nt=S.cand.filter(q=>q.kind==='t').length;
  S.role=S.me?'foe':'me';
  msg(`Найдено: людей ${nh}, роботов ${nr}, мишеней ${nt}. `+(S.me?(S.ens.length?'Цель выбрана — модель выбрана автоматически':'Тапни по цели'):'Тапни по своему бойцу'),'ok');
  refit();redraw();
}
function gwSplash(){
  const sp=document.createElement('div');sp.id='splash';
  const t=document.createElement('div');t.className='t';
  "MANMASTER'S".split('').forEach((ch,i)=>{const e=document.createElement('span');e.textContent=ch;e.style.animationDelay=(i*.08)+'s,'+(.9+i*.08)+'s';t.appendChild(e)});
  sp.appendChild(t);
  const ln=document.createElement('div');ln.className='line';sp.appendChild(ln);
  const c=document.createElement('div');c.className='c';c.textContent='corporation';sp.appendChild(c);
  for(let i=0;i<26;i++){const p=document.createElement('i');p.className='p';p.style.left=(Math.random()*100)+'vw';p.style.top=(55+Math.random()*50)+'vh';
    p.style.animationDelay=(Math.random()*2.5)+'s';p.style.animationDuration=(3+Math.random()*3)+'s';p.style.width=p.style.height=(2+Math.random()*4)+'px';sp.appendChild(p)}
  document.body.appendChild(sp);
  const off=()=>{sp.classList.add('out');setTimeout(()=>{if(sp.remove)sp.remove()},850)};
  sp.onclick=off;setTimeout(off,3500);
}
const MODELS=[['tower','Арка + прямая'],['path','Авто-путь'],['trace','Как нарисовано'],['short','Короткая'],['piece','Кусочная'],['poly','Полином'],['sin','Синус'],['exp','Экспонента']];
const AUTOM=new Set(['tower','path']);
function setModel(v,user){
  $('mod').value=v;if(user)S.userModel=true;
  if($('mod').onchange)$('mod').onchange({});
  if(user){if(AUTOM.has(v)){if($('mode').value==='draw')$('mode').value='pick'}else{$('mode').value='draw';msg('Рисуй линию пальцем по снимку: от своего бойца к цели','ok')}}
  gwSync();
}
function autoModel(){ // пока модель не выбрана вручную: одна цель — арка с прямой, несколько — авто-путь
  if(S.userModel||!S.me||!S.ens.length)return;
  const v=S.ens.length===1?'tower':'path';
  if($('mod').value!==v){$('mod').value=v;if($('mod').onchange)$('mod').onchange({})}
}
function gwSync(){
  if(!GWM)return;
  const on=(id,f)=>{const e=document.getElementById(id);if(e)e.classList.toggle('on',!!f)};
  on('rMe',S.role==='me');on('rFoe',S.role==='foe');
  on('mPick',$('mode').value==='pick');on('mDraw',$('mode').value==='draw');on('odeT',S.ode);
  MODELS.forEach(([k])=>on('mod_'+k,$('mod').value===k));
  document.querySelectorAll('.ddb').forEach(b=>b.__upd&&b.__upd());
}
function gwPick(sel){ // свой выпадающий список (системный в окне поверх игры не открывается)
  const pop=document.createElement('div');pop.id='gwpop';
  const box=document.createElement('div');box.className='box';
  Array.from(sel.options).forEach(o=>{
    if(o.disabled)return;
    const d=document.createElement('div');d.className='opt'+(o.value===sel.value?' cur':'');d.textContent=o.text;
    d.onclick=()=>{sel.value=o.value;sel.dispatchEvent(new Event('input',{bubbles:true}));sel.dispatchEvent(new Event('change',{bubbles:true}));pop.remove();gwSync()};
    box.appendChild(d);
  });
  pop.onclick=e=>{if(e.target===pop)pop.remove()};pop.appendChild(box);document.body.appendChild(pop);
}
if(GWM){
  document.body.classList.add('gw');S.role='me';
  const mkp=(id,html)=>{const e=document.createElement('div');e.id=id;if(id!=='gwstat')e.className='gwpanel';e.innerHTML=html;document.body.appendChild(e);return e};
  mkp('gwL',`<div class="brand">MANMASTER'S<span>corporation · v2</span></div>
    <button id="gb1" class="big">📷 Анализ</button>
    <div class="lbl">Кого выбираю</div>
    <div class="seg"><button id="rMe">🟢 Я</button><button id="rFoe">🔴 Цель</button></div>
    <div class="lbl">Режим</div>
    <div class="seg"><button id="mPick">🎯 Тап</button><button id="mDraw">✏ Линия</button></div>
    <div class="seg"><button id="aUndo">↶</button><button id="aClr">🧹</button><button id="aSet">⚙</button></div>
    <button id="gb2" class="big go">⌨ В игру</button>`);
  mkp('gwR',`<div class="lbl">Модель</div><div id="gwmods"></div>
    <button id="odeT">dy/dx<br><small>уравнение</small></button>
    <div class="seg"><button id="gb4">➖</button><button id="gb5">✕</button></div>`);
  mkp('gwstat','<div id="gwhint"></div><div id="gwinfo"></div>');
  const dr=document.createElement('div');dr.id='drawer';document.body.appendChild(dr);
  const drh=document.createElement('div');drh.id='drh';drh.innerHTML='<button id="drx">✕ Закрыть настройки</button>';document.body.appendChild(drh);
  document.querySelectorAll('.r,#eq,#tp,#st').forEach(n=>dr.appendChild(n));
  document.querySelectorAll('select').forEach(sel=>{
    const b=document.createElement('button');b.className='ddb';
    b.__upd=()=>{const o=sel.options[sel.selectedIndex];b.textContent=(o?o.text:'—')+' ▾'};b.__upd();
    sel.style.display='none';sel.parentNode.insertBefore(b,sel.nextSibling);b.onclick=()=>gwPick(sel);
  });
  const mods=document.getElementById('gwmods');
  MODELS.forEach(([k,l])=>{const b=document.createElement('button');b.id='mod_'+k;b.textContent=l;b.onclick=()=>setModel(k,true);mods.appendChild(b)});
  const g=id=>document.getElementById(id);
  g('rMe').onclick=()=>{S.role='me';$('mode').value='pick';msg('Тапни по своему бойцу','ok');gwSync()};
  g('rFoe').onclick=()=>{S.role='foe';$('mode').value='pick';msg('Тапни по цели: бот, игрок или мишень (можно несколько)','ok');gwSync()};
  g('mPick').onclick=()=>{$('mode').value='pick';msg('Тапни по кружку на снимке','ok');gwSync()};
  g('mDraw').onclick=()=>{$('mode').value='draw';msg('Рисуй линию пальцем по снимку','ok');gwSync()};
  g('aUndo').onclick=()=>$('undo').onclick();
  g('aClr').onclick=()=>$('clr').onclick();
  const setOpen=o=>{dr.style.display=o?'block':'none';drh.style.display=o?'block':'none'};
  g('aSet').onclick=()=>setOpen(dr.style.display!=='block');
  g('drx').onclick=()=>setOpen(false);
  g('odeT').onclick=()=>{S.ode=!S.ode;msg(S.ode?'Режим уравнения: в игру вводится правая часть dy/dx = …':'Обычный режим: вводится функция f(x)','ok');refit();redraw();gwSync()};
  g('gb1').onclick=()=>window.GW.shot();
  g('gb2').onclick=()=>{if(!S.gwText){msg('Нет формулы: выбери бойца и цель (и модель)','wa');return}window.GW.type(S.gwText)};
  g('gb4').onclick=()=>window.GW.collapse();
  g('gb5').onclick=()=>window.GW.close();
  window.GWApp={onShot:src=>load(src)};
  // заставка
  const sp=document.createElement('div');sp.id='gwsplash';
  sp.innerHTML='<svg viewBox="0 0 1000 400" preserveAspectRatio="none"><path d="M0,330 L150,330 C170,265 235,265 252,322 L256,330 L256,120 C256,35 352,35 352,120 L352,330 L356,322 C373,265 438,265 458,330 L1000,330"/></svg>';
  const tt=document.createElement('div');tt.className='t';
  "MANMASTER'S".split('').forEach((ch,i)=>{const e=document.createElement('span');e.textContent=ch;e.style.animationDelay=(.15+i*.075)+'s';tt.appendChild(e)});
  const ss=document.createElement('div');ss.className='s';ss.textContent='corporation';
  sp.appendChild(tt);sp.appendChild(ss);document.body.appendChild(sp);
  setTimeout(()=>sp.classList.add('out'),3000);setTimeout(()=>sp.remove(),4000);
  window.GWApp={onShot:src=>load(src)};
  msg('1) «📷 Анализ» → 2) тап по своему бойцу → 3) тап по цели → 4) «⌨ В игру»','ok');
  gwSync();
}

upd();
})();
</script></body></html>
