# veiculos

Trabalho de OO1

[ViacaoTartaruga] A viação tartaruga possui um frota de 12 veículos. Cada veículo tem uma capacidade única de passageiros,
um estado de origem (RJ, SP, MG, etc.) e um de destino. Quando cada veículo for criado, deveremos iniciar essas variáveis 
somente pelo construtor da classe Veículo. A classe veículo deve implementar o método comprar, que aloca um dos assentos do
veículo (se disponível), retornando um valor lógico, indicando se houve sucesso ou não, o método getNumAssentosDisponiveis,
que retorna o número de assentos ainda não vendidos, e o método getNumAssentos, que retorna o total de assentos que o veículo
dispõe.
Faça um programa principal que crie a frota de veículos num array de 12 posições, com valores fictícios e diferentes entre si
para cada objeto. A partir de então, inicie um repetição que exibe a lista de ocupação de cada ônibus (mostrada abaixo) e espere
no console que o usuário digite o número do ônibus. Ao digitar o número do ônibus, o programa deverá vender um assento e mostrar
novamente a lista de ocupação. Quando o usuário digitar 0, o programa deve ser finalizado:

01: RJ-SP (5 assentos disponíveis de 20)
02: MG-RS (10 assentos disponíveis de 15)
03: MS-RO (3 assentos disponíveis de 21)
04: BA-SE (6 assentos disponíveis de 10)
05: SC-RJ (1 assentos disponíveis de 20)
06 AM-AC (0 assentos disponíveis de 60)
07: AL-CE (20 assentos disponíveis de 20)
09: RR-GO (14 assentos disponíveis de 45)
10: RN-PE (1 assentos disponíveis de 30)
11: SP-BA (30 assentos disponíveis de 40)
12: SC-ES (0 assentos disponíveis de 10)

OBS: falta implementar o Enum dos estados... fiz com um array mesmo
