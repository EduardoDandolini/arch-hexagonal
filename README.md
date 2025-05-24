# Arquitetura Hexagonal (Ports & Adapters)

## 📝 O que é a Arquitetura Hexagonal?

A Arquitetura Hexagonal, também conhecida como **Ports and Adapters**, promove a **separação clara entre o núcleo da aplicação (domínio)** e os **mecanismos externos**, como bancos de dados, frameworks ou APIs.

Essa abordagem favorece:
- ✅ Facilidade de testes unitários.
- ✅ Baixa dependência de tecnologias específicas.
- ✅ Alto nível de manutenibilidade.

---

## 🏛️ Principais Conceitos

### ✅ Core (Domínio ou Application)
- Representa a **regra de negócio pura**.
- Não possui dependência de frameworks ou bancos de dados.
- Define **interfaces (ports)** que descrevem as operações necessárias.

---

### ✅ Ports (Portas)

**Portas** são contratos que permitem a comunicação entre o núcleo da aplicação e o mundo externo.

- 🔸 **Inbound Ports (Driving Ports)**:  
  → Interfaces de entrada, que descrevem as ações que o sistema pode realizar.  
  Exemplo: `UserServicePort`.

- 🔸 **Outbound Ports (Driven Ports)**:  
  → Interfaces de saída, que descrevem como o core interage com dependências externas.  
  Exemplo: `UserRepositoryPort`.

---

### ✅ Adapters (Adaptadores)

**Adaptadores** são implementações concretas das portas:

- 🔹 **Inbound Adapters**:  
  → Recebem requisições externas e invocam as portas de entrada.  
  Exemplo: Controllers REST, interfaces gráficas.

- 🔹 **Outbound Adapters**:  
  → Implementam as portas de saída e interagem com sistemas externos.  
  Exemplo: Repositórios JPA, clientes HTTP, serviços de mensageria.
