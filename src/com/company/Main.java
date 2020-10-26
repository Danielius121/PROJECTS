package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int zaidimas=1;
        while(zaidimas==1){
        Kalade zaidimo_kortos = new Kalade();
        zaidimo_kortos.SukurtiKalade();
        Kalade ZaidejoKortos = new Kalade();
        Kalade KompiuterioKortos = new Kalade();
        Scanner userInput = new Scanner(System.in);

            System.out.println("\n\n" + "zaisti(1), stabdyti zaidima(0)");
            zaidimas = userInput.nextInt();
            if (zaidimas==0) break;
            ZaidejoKortos.trauktiKorta(zaidimo_kortos);
            ZaidejoKortos.trauktiKorta(zaidimo_kortos);
            KompiuterioKortos.trauktiKorta(zaidimo_kortos);
            KompiuterioKortos.trauktiKorta(zaidimo_kortos);
            int ArNustatytasNugaletojas = 0;
            while(true)
            {
                System.out.println("Jusu kortos: " + ZaidejoKortos.toString());
                System.out.println("BENDRA JUSU KORTU VERTE: " + ZaidejoKortos.kortosTaskai() + "\n");
                System.out.println("KOMPIUTERIO KORTA: " + KompiuterioKortos.paimtiKorta(0).toString() + "\n");
                System.out.println("Traukti sekancia korta(1), nustoti traukti(2)");
                int response = userInput.nextInt();
                if(response == 1){
                    ZaidejoKortos.trauktiKorta(zaidimo_kortos);
                    if(ZaidejoKortos.kortosTaskai() > 21){
                        System.out.println("JUS PRALAIMEJOTE. TASKU KIEKIS: " + ZaidejoKortos.kortosTaskai());
                        ArNustatytasNugaletojas = 1;
                        break;
                    }
                }
                if(response == 2){
                    break;
                }

            }
            System.out.println("KOMPIUTERIO KORTOS:" + KompiuterioKortos.toString());
            if((KompiuterioKortos.kortosTaskai() > ZaidejoKortos.kortosTaskai())&&ArNustatytasNugaletojas == 0){
                System.out.println("KOMPIUTERIS LAIMEJO");
                ArNustatytasNugaletojas = 1;
            }
            while((KompiuterioKortos.kortosTaskai() < 17) && ArNustatytasNugaletojas == 0){
                KompiuterioKortos.trauktiKorta(zaidimo_kortos);
                System.out.println("KOMPIUTERIO SEKANTI KORTA: " + KompiuterioKortos.paimtiKorta(KompiuterioKortos.KaladesDydis()-1).toString());
            }
            System.out.println("KOMPIUTERIO TASKU SKAICIUS: " + KompiuterioKortos.kortosTaskai());
            if((KompiuterioKortos.kortosTaskai()>21)&& ArNustatytasNugaletojas == 0){
                System.out.println("JUS LAIMEJOTE! ");
                ArNustatytasNugaletojas = 1;
            }
            if((KompiuterioKortos.kortosTaskai() == ZaidejoKortos.kortosTaskai()) && ArNustatytasNugaletojas == 0){
                System.out.println("LYGIOSIOS!");
                ArNustatytasNugaletojas = 1;
            }
            if((ZaidejoKortos.kortosTaskai() > KompiuterioKortos.kortosTaskai()) && ArNustatytasNugaletojas == 0){
                System.out.println("JUS LAIMEJOTE!");
                ArNustatytasNugaletojas = 1;
            }
            else if(ArNustatytasNugaletojas == 0)
            {
                System.out.println("KOMPIUTERIS LAIMEJO!.");
            }
        }
    }


}
