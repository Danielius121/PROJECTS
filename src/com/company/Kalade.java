package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Kalade {

    private ArrayList<Korta> kortos;

    public Kalade(){ this.kortos = new ArrayList<Korta>(); }
    public void SukurtiKalade(){
        for(Rusys x : Rusys.values()){
            for(Kortos_Verte y : Kortos_Verte.values()){
                this.kortos.add(new Korta(x,y));
            }
        }
            Collections.shuffle(this.kortos);
        }
    public void IstryntiKorta(int i){
        this.kortos.remove(i);
    }
    public Korta paimtiKorta(int i){
        return this.kortos.get(i);
    }
    public void trauktiKorta(Kalade temp){
        this.kortos.add(temp.paimtiKorta(0));
        temp.IstryntiKorta(0);
    }
    public String toString(){
        String KortuSarasas = "";
        int i = 0;
        for(Korta x : this.kortos){
            KortuSarasas = KortuSarasas +  "\n" + x.toString();
            i++;

        }
        return KortuSarasas;
    }
    public int KaladesDydis(){
        return this.kortos.size();
    }
    public int kortosTaskai(){
        int taskuSuma = 0;
        int tuzuKiekis = 0;
        for(Korta x : this.kortos){
            switch(x.ApskaiciuotiKortosReiksme()){
                case DVIAKE: taskuSuma = taskuSuma+ 2; break;
                case TRIAKE: taskuSuma= taskuSuma+ 3; break;
                case KETURAKE: taskuSuma=taskuSuma+ 4; break;
                case PENKAKE: taskuSuma = taskuSuma+ 5; break;
                case SESAKE: taskuSuma = taskuSuma + 6; break;
                case SEPTYNAKE: taskuSuma = taskuSuma+7; break;
                case ASTUONAKE: taskuSuma = taskuSuma+ 8; break;
                case DEVYNAKE: taskuSuma = taskuSuma+9; break;
                case DESIMAKE: taskuSuma = taskuSuma+ 10; break;
                case VALETAS: taskuSuma = taskuSuma+ 10; break;
                case KARALIENE: taskuSuma = taskuSuma+ 10; break;
                case KARALIUS: taskuSuma =taskuSuma+ 10; break;
                case TUZAS: tuzuKiekis =tuzuKiekis+ 1; break;
            }
        }


        for(int i = 0; i < tuzuKiekis; i++){
            if (taskuSuma > 10){
                taskuSuma = 1;
            }
            else{
                taskuSuma = taskuSuma+ 11;
            }
        }
        return taskuSuma;

    }
    public class Korta {
        private Rusys rusys;
        private Kortos_Verte kortos_Verte;
        public Korta(Rusys rusys, Kortos_Verte verte){
            this.rusys = rusys;
            this.kortos_Verte = verte;
        }
        public String toString(){
            return this.rusys.toString() + " - " + this.kortos_Verte.toString();
        }
        public Kortos_Verte ApskaiciuotiKortosReiksme(){
            return this.kortos_Verte;
        }
    }



}
