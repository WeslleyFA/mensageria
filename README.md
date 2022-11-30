# Mensageria
Projeto simples de mensageria com rabbitMQ.

O serviço `Publicador` fica enviando conselhos para a fila `mensagens`.

O Serviço `Escutador` verica a fila e printa no terminal a mensagem.

Foi utilizado a API `adviceslip` pra geração das mensagens.

# Utilização
`docker-compose up`na raiz da pasta principal dos projetos.
