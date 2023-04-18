"""

CPF = 746.824.890-70
Colete a soma dos 9 primeiros dígitos do CPF
multiplicando cada um dos valores por uma
contagem regressiva começando de 10

ex: 746.824.890-70

    10  9  8  7  6  5  4  3  2
*   7   4  6  8  2  4  8  9  0
    70  36 48 56 12 20 32 27 0

Somar todos os resultados:
70+36+48+56+12+20+32+27+0 = 301

Multiplicar o resultado anterior por 10:
301 * 10= 3010

Obter o resto da divisão da conta anterior por 11:
3010 % 11 = 7

Se o resultado anterior for maior que 9:
    resultado é 0 = primeiro digito é igual a 0
Caso contrario:
    resultado é o propio resultado

O primeiro digito do CPF é 7

#-----------------------------------------------------

Para validar o segundo digito:

Colete a soma dos 9 primeiros dígitos do CPF, MAIS O PRIMEIRO DIGITO
multiplicando cada um dos valores por uma
contagem regressiva começando de 11

ex: 746.824.890-70

    11  10  9  8  7  6  5  4  3  2
*   7    4  6  8  2  4  8  9  0  7
    77  40  54 64 14 24 40 36 0  14

Somar todos os resultados: 363

multiplicar por  10  = 3630

Obter o resto da divisão da conta anterior por 11: 0

Se o resultado anterior for maior que 9:
    resultado é 0 = primeiro digito é igual a 0
Caso contrario:
    resultado é o propio resultado

O segundo digito do CPF é 0


"""

import re
import sys
import random


def Validador():

    cpf = input('Digite o CPF: ')
    cpf = re.sub(
        r'[^0-9]',
        '',
        cpf
    )

    entrada_sequencial = cpf == cpf[0] * len(cpf)

    if entrada_sequencial:
        print('Você mandou dados sequenciais')
        sys.exit()

    numcpfs = cpf[:9]
    contador_regressivo1 = 10
    resultado = 0

    for digito in numcpfs:
        resultado += (int(digito) * contador_regressivo1)
        contador_regressivo1 -= 1

    digito1 = (resultado * 10) % 11

    if digito1 <= 9:
        digito1 = digito1

    else:
        digito1 = 0

    numcpfs2 = numcpfs + str(digito1)
    contador_regressivo2 = 11
    resultado2 = 0

    for digito in numcpfs2:
        resultado2 += (int(digito) * contador_regressivo2)
        contador_regressivo2 -= 1

    digito2 = (resultado2 * 10) % 11

    if digito2 <= 9:
        digito2 = digito2

    else:
        digito2 = 0

    novocpf = numcpfs + str(digito1) + str(digito2)

    print(digito1, digito2)

    if novocpf == cpf:
        print(f'{cpf} o CPF é válido')
    else:
        print(f'{cpf} o CPF é inválido')


def gerando_cpf():

    numcpfs = ''

    for i in range(9):
        numcpfs += str(random.randint(0, 9))

    contador_regressivo1 = 10
    resultado = 0

    for digito in numcpfs:
        resultado += (int(digito) * contador_regressivo1)
        contador_regressivo1 -= 1

    digito1 = (resultado * 10) % 11

    if digito1 <= 9:
        digito1 = digito1

    else:
        digito1 = 0

    numcpfs2 = numcpfs + str(digito1)
    contador_regressivo2 = 11
    resultado2 = 0

    for digito in numcpfs2:
        resultado2 += (int(digito) * contador_regressivo2)
        contador_regressivo2 -= 1

    digito2 = (resultado2 * 10) % 11

    if digito2 <= 9:
        digito2 = digito2

    else:
        digito2 = 0

    novocpf = numcpfs + str(digito1) + str(digito2)

    print(novocpf)


if __name__ == "__main__":
    gerando_cpf()
    Validador()
