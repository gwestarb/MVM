
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author
 */
public class BiosMVM implements ISet {
  
     /*
    Recebe um objeto do tipo CPU , um objeto do tipo memoria, o numero do 
    programa no BIOS a ser executado e o numero maximo de instrucoes a executar
    (para prevenir loops infinitos)
    */
    public BiosMVM(CpuMVM _cpu,MemoriaMVM _mem,int programa,int maxInstrucoes,int enderecoDeCarga) {
        String BIOS = "BIOS VERSAO 2018-10-01 20:00";

        System.out.println(BIOS);

        switch (programa) {
            case 1:
                _mem.m[0 + enderecoDeCarga] = ISet._initAx;
                _mem.m[1 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[2 + enderecoDeCarga] = 3;
                _mem.m[3 + enderecoDeCarga] = ISet._incAx;
                _mem.m[4 + enderecoDeCarga] = ISet._moveEnd_Ax;
                _mem.m[5 + enderecoDeCarga] = 2;
                _mem.m[6 + enderecoDeCarga] = ISet._halt;
                break;
            case 2:
                _mem.m[0 + enderecoDeCarga] = 0;
                _mem.m[1 + enderecoDeCarga] = 19;
                _mem.m[2 + enderecoDeCarga] = 19;
                _mem.m[3 + enderecoDeCarga] = 19;
                _mem.m[4 + enderecoDeCarga] = 19;
                _mem.m[5 + enderecoDeCarga] = 19;
                _mem.m[6 + enderecoDeCarga] = 40;
                break;
            case 3:
                _mem.m[0 + enderecoDeCarga] = 0;
                _mem.m[1 + enderecoDeCarga] = 19;
                _mem.m[2 + enderecoDeCarga] = 19;
                _mem.m[3 + enderecoDeCarga] = 19;
                _mem.m[4 + enderecoDeCarga] = 19;
                _mem.m[5 + enderecoDeCarga] = 50; //move bp,ax
                _mem.m[6 + enderecoDeCarga] = 43; //move [bp+1],ax
                _mem.m[7 + enderecoDeCarga] = 1;
                _mem.m[8 + enderecoDeCarga] = 40; //halt
                break;
            case 11:
                _mem.m[0 + enderecoDeCarga] = 0;
                _mem.m[1 + enderecoDeCarga] = 44;
                _mem.m[2 + enderecoDeCarga] = 255;
                _mem.m[3 + enderecoDeCarga] = 48;
                _mem.m[4 + enderecoDeCarga] = 27;
                _mem.m[5 + enderecoDeCarga] = 30;
                _mem.m[6 + enderecoDeCarga] = 30;
                _mem.m[7 + enderecoDeCarga] = 27;
                _mem.m[8 + enderecoDeCarga] = 60;
                _mem.m[9 + enderecoDeCarga] = 30;
                _mem.m[10 + enderecoDeCarga] = 40;                
                _mem.m[30 + enderecoDeCarga] = 31;
                _mem.m[31 + enderecoDeCarga] = 44;
                _mem.m[32 + enderecoDeCarga] = 30;
                _mem.m[33 + enderecoDeCarga] = 9;
                _mem.m[34 + enderecoDeCarga] = 8;
                _mem.m[35 + enderecoDeCarga] = 30;
                _mem.m[36 + enderecoDeCarga] = 38;
                _mem.m[37 + enderecoDeCarga] = 28;
                _mem.m[60 + enderecoDeCarga] = 31;
                _mem.m[61 + enderecoDeCarga] = 5;
                _mem.m[62 + enderecoDeCarga] = 255;
                _mem.m[63 + enderecoDeCarga] = 3;
                _mem.m[64 + enderecoDeCarga] = 30;
                _mem.m[65 + enderecoDeCarga] = 38;
                _mem.m[66 + enderecoDeCarga] = 28;
                break;
            case 12: // Exercicio 10
                _mem.m[0 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[1 + enderecoDeCarga] = 30;
                _mem.m[2 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[3 + enderecoDeCarga] = 60;
                _mem.m[4 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[5 + enderecoDeCarga] = 255;
                _mem.m[6 + enderecoDeCarga] = ISet._moveSp_Ax;
                _mem.m[7 + enderecoDeCarga] = ISet._int;
                _mem.m[8 + enderecoDeCarga] = 1;
                _mem.m[9 + enderecoDeCarga] = ISet._int;
                _mem.m[10 + enderecoDeCarga] = 3;
                _mem.m[11 + enderecoDeCarga] = ISet._halt;
                _mem.m[30 + enderecoDeCarga] = ISet._pushAx;
                _mem.m[31 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[32 + enderecoDeCarga] = 30;
                _mem.m[32 + enderecoDeCarga] = ISet._outAx;
                _mem.m[34 + enderecoDeCarga] = ISet._nop;
                _mem.m[35 + enderecoDeCarga] = ISet._nop;
                _mem.m[36 + enderecoDeCarga] = ISet._popAx;
                _mem.m[37 + enderecoDeCarga] = ISet._iret;
                _mem.m[60 + enderecoDeCarga] = ISet._pushAx;
                _mem.m[61 + enderecoDeCarga] = ISet._moveAx_End;
                _mem.m[62 + enderecoDeCarga] = 255;
                _mem.m[63 + enderecoDeCarga] = ISet._outAx;
                _mem.m[64 + enderecoDeCarga] = ISet._nop;
                _mem.m[65 + enderecoDeCarga] = ISet._popAx;
                _mem.m[66 + enderecoDeCarga] = ISet._iret;
                break;
            case 25:
                _mem.m[0 + enderecoDeCarga] = 26;
                _mem.m[1 + enderecoDeCarga] = 2;
                _mem.m[2 + enderecoDeCarga] = 40;
                break;
            case 26:
                _mem.m[0 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[1 + enderecoDeCarga] = 255;
                _mem.m[2 + enderecoDeCarga] = ISet._moveSp_Ax;
                _mem.m[3 + enderecoDeCarga] = ISet._pushBp;
                _mem.m[4 + enderecoDeCarga] = ISet._moveBp_Sp;
                _mem.m[5 + enderecoDeCarga] = ISet._pushAx;
                _mem.m[6 + enderecoDeCarga] = ISet._pushBx;              
                _mem.m[7 + enderecoDeCarga] = ISet._halt;
                break;
            case 55:
                _mem.m[0 + enderecoDeCarga] = ISet._jmp;
                _mem.m[1 + enderecoDeCarga] = 35;
                
                //codigo do device driver que executa a SYSTEM CALL
                _mem.m[25 + enderecoDeCarga] = ISet._pushAx; //salva o caractere a ser mostrado
                _mem.m[26 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[27 + enderecoDeCarga] = 1025;                      //seleciona o device
                _mem.m[28 + enderecoDeCarga] = ISet._outAx; 
                _mem.m[29 + enderecoDeCarga] = ISet._popAx;   //restaura o caractere a ser mostrado
                _mem.m[30 + enderecoDeCarga] = ISet._outAx;
                _mem.m[31 + enderecoDeCarga] = ISet._iret; //retorna da interrupcao
                
                
                //codigo do programa que escreve na "tela" ou "memoria de video
                _mem.m[35 + enderecoDeCarga] = ISet._initAx;
                _mem.m[36 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[37 + enderecoDeCarga] = 20;
                _mem.m[38 + enderecoDeCarga] = ISet._moveSp_Ax; //seta a pilha de execucao
                _mem.m[39 + enderecoDeCarga] = ISet._moveAx_Valor; //endereco inicio device driver video
                _mem.m[40 + enderecoDeCarga] = 25;
                _mem.m[41 + enderecoDeCarga] = ISet._moveEnd_Ax; //seta tabela vetores interrupcao
                _mem.m[42 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere A na posicao (0,0) do monitor
                _mem.m[43 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[44 + enderecoDeCarga] = 0;
                _mem.m[45 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[46 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[47 + enderecoDeCarga] = 0;
                _mem.m[48 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[49 + enderecoDeCarga] = 0;
                _mem.m[50 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[51 + enderecoDeCarga] = 65; //"A"
                _mem.m[52 + enderecoDeCarga] = ISet._int;
                _mem.m[53 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere B na posicao (0,39)
                _mem.m[54 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[55 + enderecoDeCarga] = 0;
                _mem.m[56 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[57 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[58 + enderecoDeCarga] = 39;
                _mem.m[59 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[60 + enderecoDeCarga] = 0;
                _mem.m[61 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[62 + enderecoDeCarga] = 66;  //"B"
                _mem.m[63 + enderecoDeCarga] = ISet._int;
                _mem.m[64 + enderecoDeCarga] = 2;
                //--------------------------- escreve o caractere C na posicao (4,0) do monitor
                _mem.m[65 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[66 + enderecoDeCarga] = 4;
                _mem.m[67 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[68 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[69 + enderecoDeCarga] = 0;
                _mem.m[70 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[71 + enderecoDeCarga] = 0;
                _mem.m[72 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[73 + enderecoDeCarga] = 67; //"C"
                _mem.m[74 + enderecoDeCarga] = ISet._int;
                _mem.m[75 + enderecoDeCarga] = 2;
                //---------------------------- escreve o caractere D na posicao (4,39) do monitor
                _mem.m[76 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[77 + enderecoDeCarga] = 4;
                _mem.m[78 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[79 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[80 + enderecoDeCarga] = 39;
                _mem.m[81 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[82 + enderecoDeCarga] = 0;
                _mem.m[83 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[84 + enderecoDeCarga] = 68;  //"D"
                _mem.m[85 + enderecoDeCarga] = ISet._int;
                _mem.m[86 + enderecoDeCarga] = 2;
                //----------------------------- apaga a tela
                
                //----------------------------- escreve o caractere espaco na posicao (0,0) do monitor
                _mem.m[87 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[88 + enderecoDeCarga] = 0;
                _mem.m[89 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[90 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[91 + enderecoDeCarga] = 1;
                _mem.m[92 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[93 + enderecoDeCarga] = 0;
                _mem.m[94 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[95 + enderecoDeCarga] = 69;
                _mem.m[96 + enderecoDeCarga] = ISet._int;
                _mem.m[97 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere espaco na posicao (0,39)
                _mem.m[98 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[99 + enderecoDeCarga] = 0;
                _mem.m[100 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[101 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[102+ enderecoDeCarga] = 38;
                _mem.m[103 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[104 + enderecoDeCarga] = 0;
                _mem.m[105 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[106 + enderecoDeCarga] = 70;
                _mem.m[107 + enderecoDeCarga] =ISet. _int;
                _mem.m[108 + enderecoDeCarga] = 2;
                //---------------------------- escreve o caractere espaco na posicao (4,0) do monitor
                _mem.m[109 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[110 + enderecoDeCarga] = 4;
                _mem.m[111 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[112 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[113 + enderecoDeCarga] = 1;
                _mem.m[114 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[115 + enderecoDeCarga] = 0;
                _mem.m[116 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[117 + enderecoDeCarga] = 71;
                _mem.m[118 + enderecoDeCarga] = ISet._int;
                _mem.m[119 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere espaco na posicao (4,39) do monitor
                _mem.m[120 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[121 + enderecoDeCarga] = 4;
                _mem.m[122 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[123 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[124 + enderecoDeCarga] = 38;
                _mem.m[125 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[126 + enderecoDeCarga] = 0;
                _mem.m[127 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[128 + enderecoDeCarga] = 72;
                _mem.m[129 + enderecoDeCarga] = ISet._int;
                _mem.m[130 + enderecoDeCarga] = 2;
                
                _mem.m[131 + enderecoDeCarga] = ISet._halt;
                break;
                
            case 56: //Nucleo de SO
                _mem.m[0 + enderecoDeCarga] = 26;
                _mem.m[1 + enderecoDeCarga] = 10;
                _mem.m[2 + enderecoDeCarga] = 204;
                _mem.m[3 + enderecoDeCarga] = 219;
                _mem.m[4 + enderecoDeCarga] = 234;
                _mem.m[5 + enderecoDeCarga] = 249;
                _mem.m[6 + enderecoDeCarga] = 0;
                
                _mem.m[10 + enderecoDeCarga] = 44;	
                _mem.m[11 + enderecoDeCarga] = 19;
                _mem.m[12 + enderecoDeCarga] = 9;
                _mem.m[13 + enderecoDeCarga] = 0;
                _mem.m[14 + enderecoDeCarga] = 5;
                _mem.m[15 + enderecoDeCarga] = 5;
                _mem.m[16 + enderecoDeCarga] = 48;
                _mem.m[17 + enderecoDeCarga] = 39;
                _mem.m[18 + enderecoDeCarga] = 51;	
                _mem.m[19 + enderecoDeCarga] = 0;	
                _mem.m[20 + enderecoDeCarga] = 4;
                _mem.m[21 + enderecoDeCarga] = 5;
                _mem.m[22 + enderecoDeCarga] = 6;
                _mem.m[23 + enderecoDeCarga] = 3;
                _mem.m[24 + enderecoDeCarga] = 44;
                _mem.m[25 + enderecoDeCarga] = 0;
                _mem.m[26 + enderecoDeCarga] = 45;
                _mem.m[27 + enderecoDeCarga] = 30;
                _mem.m[28 + enderecoDeCarga] = 26;
                _mem.m[29 + enderecoDeCarga] = 39;
                _mem.m[30 + enderecoDeCarga] = 4;
                _mem.m[31 + enderecoDeCarga] = 5;
                _mem.m[32 + enderecoDeCarga] = 2;
                _mem.m[33 + enderecoDeCarga] = 48;
                _mem.m[34 + enderecoDeCarga] = 21;
                _mem.m[35 + enderecoDeCarga] = 2;
                _mem.m[36 + enderecoDeCarga] = 9;
                _mem.m[37 + enderecoDeCarga] = 6;
                _mem.m[38 + enderecoDeCarga] = 51;
                _mem.m[39 + enderecoDeCarga] = 44;
                _mem.m[40 + enderecoDeCarga] = 1;
                _mem.m[41 + enderecoDeCarga] = 45;
                _mem.m[42 + enderecoDeCarga] = 45;
                _mem.m[43 + enderecoDeCarga] = 26;
                _mem.m[44 + enderecoDeCarga] = 54;
                _mem.m[45 + enderecoDeCarga] = 4;
                _mem.m[46 + enderecoDeCarga] = 5;
                _mem.m[47 + enderecoDeCarga] = 3;
                _mem.m[48 + enderecoDeCarga] = 48;
                _mem.m[49 + enderecoDeCarga] = 21;
                _mem.m[50 + enderecoDeCarga] = 2;	
                _mem.m[51 + enderecoDeCarga] = 9;	
                _mem.m[52 + enderecoDeCarga] = 6;	
                _mem.m[53 + enderecoDeCarga] = 51;	
                _mem.m[54 + enderecoDeCarga] = 0;	
                _mem.m[55 + enderecoDeCarga] = 9;	
                _mem.m[56 + enderecoDeCarga] = 6;	
                _mem.m[57 + enderecoDeCarga] = 5;	
                _mem.m[58 + enderecoDeCarga] = 4;
                _mem.m[59 + enderecoDeCarga] = 48;
                _mem.m[60 + enderecoDeCarga] = 51;	                
                _mem.m[70 + enderecoDeCarga] = ISet._jmp;	  
                _mem.m[71 + enderecoDeCarga] = 70;
                _mem.m[74 + enderecoDeCarga] = ISet._jmp;	  
                _mem.m[75 + enderecoDeCarga] = 74;	  	  
                _mem.m[78 + enderecoDeCarga] = ISet._moveAx_Valor;	  
                _mem.m[79 + enderecoDeCarga] = 1;	  	  
                _mem.m[80 + enderecoDeCarga] = ISet._incAx;
                _mem.m[81 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[82 + enderecoDeCarga] = ISet._nop;
                _mem.m[83 + enderecoDeCarga] = ISet._moveCx_Ax;  
                _mem.m[84 + enderecoDeCarga] = ISet._incCx;  
                _mem.m[85 + enderecoDeCarga] = ISet._jmp;                
                _mem.m[86 + enderecoDeCarga] = 80;
                
                _mem.m[209 + enderecoDeCarga] = 70;
                _mem.m[224 + enderecoDeCarga] = 74;
                _mem.m[239 + enderecoDeCarga] = 78;
                _mem.m[254 + enderecoDeCarga] = 19;
                break;
            default:
                programa = 0;
                break;
        }
        _cpu.decodificador(_mem, enderecoDeCarga,maxInstrucoes);
    }
}
