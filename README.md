# Sistema de Informação e Monitoria da Saúde de Funcionários Com Doenças Crónicas

---

![Tela de Login](https://github.com/mmaunze/sigemonitoria/blob/main/demo/login.jpg)

*Bem-vindo ao Sistema de Informação e Monitoria da Saúde de Funcionários Com Doenças Crónicas desenvolvido em Java Swing, JPA e MySQL! Este documento fornece uma visão abrangente das funcionalidades, instruções detalhadas de uso e informações sobre a configuração do sistema.*

## Índice

1. [Funcionalidades](#funcionalidades)
2. [Instruções de Uso](#instruções-de-uso)
3. [Requisitos do Sistema](#requisitos-do-sistema)
4. [Configuração do Projeto](#configuração-do-projeto)
5. [Contribuição e Suporte](#contribuição-e-suporte)

---

## Funcionalidades

![Menu](https://github.com/mmaunze/sigemonitoria/blob/main/demo/menu.jpg)

### 1. Criar Senha de Acesso
- Permite que o usuário crie uma senha segura para acessar o sistema, garantindo a privacidade e segurança dos dados.

![Criar Usuario](https://github.com/mmaunze/sigemonitoria/blob/main/demo/menu.jpg)

### 2. Autenticação de Senha
- Solicita a senha do usuário para validar o acesso e garantir que apenas pessoas autorizadas possam atualizar ou inserir novos dados.

### 3. Inserir Novos Dados
- Permite a inserção de novos registros de funcionários com doenças crônicas, incluindo dados pessoais e informações de saúde.

### 4. Atualizar Dados por NID
- Permite a atualização dos dados dos funcionários utilizando o Número de Identificação (NID) como referência, assegurando que as informações estejam sempre atualizadas.

### 5. Acesso por NID
- Permite que o usuário insira o NID para acessar e visualizar os dados específicos de um funcionário, facilitando a consulta rápida e precisa.

### 6. Armazenamento de Dados
- Os dados são armazenados de forma segura em uma base de dados MySQL, utilizando JPA (Java Persistence API) para a comunicação eficiente com o banco de dados.

![Cadastro de Dados](https://github.com/mmaunze/sigemonitoria/blob/main/demo/cadastro.jpg)

### 7. Edição e Salvamento de Dados
- Permite a edição dos dados existentes e salvamento das alterações, garantindo que todas as informações estejam sempre corretas e atualizadas.

### 8. Geração de Relatórios em PDF
- Gera relatórios periódicos automaticamente em formato PDF, facilitando a análise e acompanhamento da saúde dos funcionários.

![Gerar Relatorio](https://github.com/mmaunze/sigemonitoria/blob/main/demo/gerar_relatorio.jpg)

## Instruções de Uso

### 1. Autenticação de Senha
- Ao iniciar o sistema, será solicitada a senha de acesso. Insira a senha correta para desbloquear as funcionalidades do sistema.

### 2. Inserir Novos Dados
- Após a autenticação bem-sucedida, o usuário poderá inserir novos dados utilizando o formulário fornecido. Certifique-se de preencher todos os campos obrigatórios.

### 3. Atualizar Dados por NID
- Para atualizar dados existentes, insira o NID correspondente no campo de busca e faça as alterações necessárias. Clique em "Salvar" para confirmar as mudanças.

### 4. Geração de Relatórios
- Os relatórios periódicos em formato PDF são gerados automaticamente e podem ser acessados na seção "Relatórios" do menu principal. Esses relatórios fornecem uma visão abrangente da saúde dos funcionários monitorados.

## Requisitos do Sistema

- **Java Development Kit (JDK)**: Versão 17 ou superior.
- **MySQL Database**: Versão 8 ou superior.
- **Ambiente de Desenvolvimento Integrado (IDE)** compatível com Java: Eclipse, IntelliJ, NetBeans, VSCode, etc.

## Configuração do Projeto

### 1. Base de Dados
- Configure uma base de dados MySQL para armazenar os dados do sistema. Crie um banco de dados e configure as credenciais de acesso.

### 2. Configuração do JPA
- Configure as propriedades do JPA no arquivo `persistence.xml` para se conectar ao banco de dados MySQL. Certifique-se de definir corretamente as propriedades `javax.persistence.jdbc.url`, `javax.persistence.jdbc.user` e `javax.persistence.jdbc.password`.

### 3. Execução do Projeto
- Importe o projeto para o seu ambiente de desenvolvimento preferido e execute-o. Certifique-se de que todas as dependências estejam corretamente configuradas no seu `pom.xml` (para projetos Maven) ou `build.gradle` (para projetos Gradle).

## Contribuição e Suporte

- Contribuições são bem-vindas! Se encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request no repositório do projeto no GitHub.
- Para suporte adicional, entre em contato com a equipe de desenvolvimento através dos canais fornecidos no repositório.

---

Obrigado por escolher nosso sistema de gerenciamento de dados! Esperamos que seja útil para suas necessidades de monitoria e gerenciamento de saúde dos funcionários.