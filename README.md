# Solar Panel Database ☀️
Pensamos em desenvolver um aplicativo referente a ODS 7 (Energia Limpa e Acessível) com o objetivo de reduzir os gastos dos clientes com energia, melhorar a eficiência do uso de energia solar, monitorar o desempenho do sistema em tempo real, estimar o custo e tempo de uso, fornecer diagnostico completos e incentivar o uso de energia solar.

# Funcionalidades 📋
⇨ Registro de novos painéis solares com especificações técnicas.

⇨ Consulta de painéis por fabricante, modelo, potência, etc.

⇨ Gerenciamento de dados de eficiência e desempenho.

# Instalação 🔨
Para que este projeto funcione corretamente, você precisará dos seguintes softwares instalados em seu ambiente:
- **Java Development Kit (JDK):** Versão 17 ou superior (você pode verificar sua versão com `java --version`).
- **MySQL Server:** Versão 8.0 ou superior (verifique com `mysql --version` ou através do seu gerenciador de banco de dados).
- **Conector JDBC Java**: mysql-connector-j-8.4.0

### Configuração do Banco de Dados MySQL
1.  Certifique-se de que seu servidor MySQL esteja em execução.
2.  ```bash
    root
    ```
    (Insira sua senha quando solicitado)
DATABASE db_pessoas:

```sql
CREATE DATABASE db_pessoas;
use db_pessoas;

CREATE TABLE DAO(
codigo INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200),
fone VARCHAR(200),
email VARCHAR(200)
);

INSERT INTO DAO (nome, fone, email) VALUES (?, ?, ?);
DELETE FROM DAO WHERE codigo = 9;
SELECT * FROM DAO;
```

DATABASE db_placa:

```sql
CREATE DATABASE db_placa;
USE db_placa;
CREATE TABLE Placas (
codigo INT PRIMARY KEY AUTO_INCREMENT,
tipoPlaca VARCHAR(200),
potencia VARCHAR(200),
eficiencia VARCHAR(200),
celulas VARCHAR(200),
material VARCHAR(200)
);
DELETE FROM Placas WHERE codigo = ?;
DELETE FROM Placas WHERE codigo = 2;
SELECT * FROM Placas;
UPDATE Placas SET tipoPlaca = 'Tipo B', potencia = 50, eficiencia = 30, material = 'plastico' WHERE codigo = 4;
```
