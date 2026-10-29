# Sistema de ventas Java: "Minimarket Family mart"

Este repositorio contiene el código fuente del proyecto FamilyMartPOS, un sistema integral de punto de venta (POS) y gestión de inventario estructurado con permisos basados en roles[cite: 1, 3]. El sistema está diseñado para optimizar el flujo de atención al cliente y proveer herramientas de auditoría para la administración[cite: 1].

## Características Principales

*   **Autenticación Segura:** Sistema de login con validación estricta de contraseñas (expresiones regulares) y enrutamiento automático de ventanas según el rol del usuario (Administrador o Cajero)[cite: 1, 3].
*   **Módulo de Cajero (Punto de Venta):** Interfaz optimizada con patrón de Pantalla Dividida (Split Screen) que permite buscar productos en tiempo real, gestionar un carrito de compras y generar boletas de pago exportadas automáticamente a formato PDF[cite: 1, 3]. Al realizar el cobro, el sistema descuenta automáticamente el stock y registra la transacción[cite: 1].
*   **Módulo de Administrador (Gestión y Auditoría):** Panel unificado con navegación por pestañas que incluye[cite: 1]:
    *   CRUD completo para el catálogo de productos y gestión de usuarios[cite: 1, 3].
    *   Mecanismo de "eliminación lógica" (cambio de estado a 0) para mantener la integridad del historial de ventas[cite: 1, 3].
    *   Dashboard interactivo (Tablero de Control) con indicadores clave de rendimiento (KPIs), historial de transacciones y gráficos de barras analíticos para monitorear productos con stock crítico[cite: 1, 3].

## Stack Tecnológico

*   **Lenguaje Base:** Java[cite: 1].
*   **Interfaz Gráfica (GUI):** Java Swing (JFrames, JPanels, JTabbedPane)[cite: 1].
*   **Entorno de Desarrollo:** Apache NetBeans[cite: 1, 3].
*   **Gestor de Construcción y Dependencias:** Maven[cite: 1, 3].
*   **Base de Datos:** MySQL Server[cite: 1, 3].
*   **Librerías Externas (Declaradas en `pom.xml`):**
    *   `mysql-connector-j`: Driver oficial para la conexión JDBC con MySQL[cite: 1, 2].
    *   `jfreechart`: Renderizado del gráfico de barras para la alerta de reposición de stock[cite: 1, 2].
    *   `openpdf`: Generación dinámica y exportación de tickets de compra a formato PDF[cite: 1, 2].

## Arquitectura y Patrones de Diseño

El código fuente respeta principios de Ingeniería de Software para garantizar su escalabilidad y fácil mantenimiento:

*   **Patrón MVC (Modelo-Vista-Controlador):** Separación estricta entre las entidades de negocio (Modelo), las interfaces gráficas construidas en Swing (Vista) y la lógica de eventos y validaciones (Controlador)[cite: 1, 2].
*   **Patrón DAO (Data Access Object):** Centralización de todas las sentencias SQL (INSERT, SELECT, UPDATE) aislando el acceso a la base de datos de los formularios visuales[cite: 1, 2].
*   **Patrón Singleton:** Implementado en la clase de conexión para garantizar una instancia única compartida en la comunicación con MySQL Server, optimizando el consumo de recursos[cite: 1, 2].
*   **Patrones de Interfaz de Usuario:** Implementación de Formulario de Autenticación, Pantalla Dividida (Split Screen) para agilidad operativa y Navegación por Pestañas / Tablero de Control para consolidación de reportes[cite: 1, 2].

## Estructura de la Base de Datos

El modelo relacional está compuesto por 5 entidades principales[cite: 3]:
1.  **Roles:** Define los niveles de acceso (Cajero, Administrador)[cite: 3].
2.  **Usuarios:** Credenciales de acceso vinculadas a un rol específico[cite: 3].
3.  **Productos:** Catálogo con códigos de barras, precios y control de inventario[cite: 3].
4.  **Ventas:** Cabecera transaccional de los tickets emitidos[cite: 3].
5.  **DetalleVenta:** Desglose individual de los artículos adquiridos en cada venta[cite: 3].

## Instalación y Ejecución

1.  **Base de Datos:** Ejecuta el archivo de respaldo `.sql` incluido en el repositorio dentro de MySQL Workbench para generar las tablas y los datos de prueba[cite: 3].
2.  **Configuración de Conexión:** Navega a `src/main/java/com/twcorpororation/familymart/dao/Conexion.java` y actualiza la variable `PASSWORD` con la contraseña de tu servidor MySQL local[cite: 3].
3.  **Compilación:** Abre el proyecto en Apache NetBeans. Asegúrate de tener JDK 17 o 21 configurado, haz clic derecho sobre el proyecto y selecciona **Clean and Build** para que Maven descargue automáticamente las dependencias necesarias[cite: 1, 2, 4].
4.  **Ejecución:** Ejecuta la clase principal para iniciar la pantalla de Login[cite: 1]. (Credenciales por defecto: `admin` / `123456`)[cite: 1, 2].
