
## Sistema de Informação e Monitoria da Saúde de Funcionários Com Doenças Crónicas
---
---

![Tela de Login](https://github.com/mmaunze/sigemonitoria/blob/main/demo/login.jpg)

*Bem-vindo ao sistema Sistema de Informação e Monitoria da Saúde de Funcionários Com Doenças Crónicas desenvolvido em Java Swing, JPA e MySQL! Este documento fornece uma visão geral das funcionalidades e instruções básicas de uso do sistema.*

### Funcionalidades
![Menu](https://github.com/mmaunze/sigemonitoria/blob/main/demo/menu.jpg)

1. **Criar Senha de Acesso**:
   - Permite que o usuário crie uma senha para ter acesso ao sistema.
---
![Criar Usuario](https://github.com/mmaunze/sigemonitoria/blob/main/demo/menu.jpg)
---

2. **Autenticação de Senha**:
   - Solicita a senha do usuário para atualizar ou inserir novos dados.

3. **Inserir Novos Dados**:
   - Permite a inserção de novos dados referentes a novos casos.

4. **Atualizar Dados por NID**:
   - Permite a atualização de dados com base no NID (Número de Identificação).

5. **Acesso por NID**:
   - Permite que o usuário insira o NID para acessar os dados.

6. **Armazenamento de Dados**:
   - Os dados são armazenados em uma base de dados MySQL, utilizando JPA para a comunicação com o banco de dados.
---
![Cadastro de Dados](https://github.com/mmaunze/sigemonitoria/blob/main/demo/cadastro.jpg)
---

7. **Edição e Salvamento de Dados**:
   - Permite editar dados existentes e salvar as alterações.

8. **Geração de Relatórios em PDF**:
   - Gera relatórios periódicos automaticamente em formato PDF.

### Instruções de Uso

1. **Autenticação de Senha**:
   - Ao iniciar o sistema, será solicitada a senha de acesso.

2. **Inserir Novos Dados**:
   - Após a autenticação bem-sucedida, o usuário poderá inserir novos dados usando o formulário fornecido.

3. **Atualizar Dados por NID**:
   - Para atualizar dados existentes, o usuário pode inserir o NID correspondente e fazer as alterações necessárias.

4. **Geração de Relatórios**:
   - Os relatórios periódicos em formato PDF são gerados automaticamente e podem ser acessados no sistema.
---
![Gerar Relatorio](https://github.com/mmaunze/sigemonitoria/blob/main/demo/gerar_relatorio.jpg)
---

### Requisitos do Sistema

- **Java Development Kit (JDK)**: Versão 17 ou superior.
- **MySQL Database**: Versão 8 ou superior.
- **Ambiente de Desenvolvimento Integrado (IDE)** compatível com Java: Eclipse, IntelliJ, NetBeans, VSCode, etc.

### Configuração do Projeto

1. **Base de Dados**:
   - Configure uma base de dados MySQL para armazenar os dados do sistema.

2. **Configuração do JPA**:
   - Configure as propriedades do JPA (persistence.xml) para se conectar a base de dados MySQL.

3. **Execução do Projeto**:
   - Importe o projeto para o seu ambiente de desenvolvimento e execute-o.

### Contribuição e Suporte

- Se encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request no repositório do projeto no GitHub.

---

Obrigado por escolher nosso sistema de gerenciamento de dados! Esperamos que seja útil para suas necessidades de gerenciamento de dados.
