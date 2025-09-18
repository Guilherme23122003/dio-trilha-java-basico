```mermaid
flowchart TD
    A[Throwable] --> B[Error]
    A --> C[Exception]
    C --> D[Checked Exceptions]
    C --> E[Unchecked Exceptions]
    E --> F[RuntimeException]

    subgraph Tratamento
        G[try]
        H[catch]
        I[finally]
        J[throw]
        K[throws]
    end

    D -.-> Tratamento
    E -.-> Tratamento