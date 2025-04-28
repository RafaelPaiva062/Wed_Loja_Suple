drop database  if exists  lojaSuple;
create database lojaSuple;
use lojaSuple;
show tables;
describe produtos;
create table produtos(
id_produtos int primary key auto_increment,
categoria varchar(50) not null,
nome varchar(255) not null,
preco double not null,
imagens varchar(255),
quantidade int not null
);
CREATE TABLE estoque (
id_estoque INT AUTO_INCREMENT PRIMARY KEY,
id_produtos INT,
preco_unitario DECIMAL(10, 2) NOT NULL,
quantidade INT NOT NULL,
data_entrada DATETIME DEFAULT CURRENT_TIMESTAMP,
data_saida DATETIME,
FOREIGN KEY (id_produtos) REFERENCES produtos(id_produtos)
);
-- Usando o banco de dados
USE lojaSuple;
-- Inserindo dados na tabela 'produtos' para aminoacidos
INSERT INTO produtos (categoria, nome, preco, quantidade) VALUES
('aminoacidos', '-GROWTH SUPPLEMENTS- CREATINA MONOHIDRATADA 250G -', 79.92, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS- CREATINA (250G) CREAPURE® -', 103.50, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS- CREATINA MONOHIDRATADA 100G -', 40.50, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS- CREATINA (100) CREAPURE® -', 45.50, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS- L-GLUTAMINA (250G) -', 48.60, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-BETA-ALANINA EM PÓ -', 63.00, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-POWER ARGININE (120 CAPS) -', 27.00, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-BCAA 2:1:1 (120 cáps) -', 22.50, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS- ARGININE POWER (250G) -', 54.90, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-BCAA 10:1:1 (200g) (em pó) -', 50.40, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-Amino Powder 10 - 200g -', 67.50, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-L-Carnitina (200g)', 79.20, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-Beta-Alanina 120 Comprimidos -', 74.79, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-Triptofano 120 caps -', 36.00, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-Taurina Powder 250g -', 40.50, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-L-Carnitina Líquida 2000 - 420ml -', 42.30, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-BCAA 5:1:1 (200g) (em pó) -', 45.90, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-BCAA 10:1:1 120 Comprimidos -', 63.00, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-BCAA 2:1:1 120 Comprimidos TAB -', 45.00, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-BCAA 2:1:1 (200g) (em pó) -', 42.50, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-Beta-Alanina 120 Comprimidos -', 74.70, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-L-LEUCINE (200G) -', 39.60, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-TRIPTOFANO ULTRA - 120 COMP -', 99.00, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-HMB 90 CAPS -', 35.10, 1),
('aminoacidos', '-GROWTH SUPPLEMENTS-TAURINA 1000MG 120 COMPRIMIDOS -', 54.00, 1),
('aminoacidos', '- Max Titanium -Creatina 300 g -', 110.00, 1),
('aminoacidos', '- Max Titanium -Creatina Creapure 250g -', 151.68, 1),
('aminoacidos', '- Max Titanium -Creatina Creapure 250g - Linha Dino -', 159.26, 1),
('aminoacidos', '- Max Titanium -Creatina 150g -', 68.21, 1),
('aminoacidos', '- Max Titanium -Creatina 100g -', 60.62, 1),
('aminoacidos', '- Max Titanium -Creatina 120 Caps-', 68.21, 1);

--  Inserindo dados na tabela 'produtos' para hipercalorico
insert into produtos(categoria,nome,preco,quantidade)values
('hipercalorico','-GROWTH SUPPLEMENTS-HIPER MASS (1KG) SABOR CHOCOLATE - ', 36.00, 1),
('hipercalorico', '-GROWTH SUPPLEMENTS-(TOP) HIPERCALÓRICO (SABOR CHOCOLATE) (1KG) -', 49.50, 1),
('hipercalorico', '-GROWTH SUPPLEMENTS-BIG MASS PRO HIPERCALÓRICO 3KG -', 144.00, 1),
('hipercalorico', '- Max Titanium-Mass Titanium Refil 3Kg -', 117.56, 1),
('hipercalorico', '- Max Titanium-Super Gainers Refil 3Kg-', 125.13, 1),
('hipercalorico', '- Max Titanium-Mass Titanium 17500 ZERO LACTOSE 2,4kg-', 110.00, 1),
('hipercalorico', '- Max Titanium-Super Whey 900G-', 75.85, 1),
('hipercalorico', '- Max Titanium-Mass Titanium Refil 1,4Kg-', 64.50, 1);
insert into produtos(categoria,nome,preco,quantidade)values
('hipercalorico', '-  Integralmedica -Creamass Hipercalorico com Creatina 3Kg-', 110.52, 1),
('hipercalorico', '-  Integralmedica -Nutri Whey Protein Pote 900g-', 82.94, 1),
('hipercalorico', '-  Integralmedica -Nutri Whey Protein  900g-', 75.04, 1),
('hipercalorico', '-  Integralmedica -Nutri Whey Protein  1,8Kg-', 134.22, 1);
-- Produtos Growth - Pré-Treino
INSERT INTO produtos (categoria, nome, preco, quantidade) VALUES
('pre_treino', '- Growth Supplements-Pré-Treino Haze Hardcore 300g  -', 103.50, 1),
('pre_treino', '- Growth Supplements-Pré-treino Insanity 300g  -', 108.00, 1),
('pre_treino', '- Max Titanium-Égide 300g  -', 151.71, 1),
('pre_treino', '- Max Titanium-Horus 150g  -', 89.90, 1),
('pre_treino', '- Integralmedica-Huger Pré-Treino 320g -', 111.93, 1),
('pre_treino', '- Integralmedica-Beta Alanina em Pó 123g -', 70.31, 1);

INSERT INTO produtos (categoria, nome, preco, quantidade) VALUES
('proteina', '- GROWTH SUPPLEMENTS -WHEY PROTEIN CONCENTRADO (1KG)', 108.00, 1),
('proteina', '- GROWTH SUPPLEMENTS - DOSE WHEY PROTEIN CONCENTRADO 30GR)', 3.96, 1),
('proteina', '- GROWTH SUPPLEMENTS - BEBIDA LÁCTEA UHT DE PROTEÍNAS', 5.67, 1),
('proteina', '- GROWTH SUPPLEMENTS - BARRA DE PROTEÍNA (BARRINHA DE PROTEÍNA) - DISPLAY C/ 12 UN. ', 28.08, 1),
('proteina', '- GROWTH SUPPLEMENTS - (TOP) WHEY PROTEIN CONCENTRADO 1KG', 114.90, 1),
('proteina', '- GROWTH SUPPLEMENTS - WHEY PROTEIN CONCENTRADO 900G', 96.00, 1),
('proteina', '- GROWTH SUPPLEMENTS - WHEY PROTEIN ISOLADO (900G)', 139.50, 1),
('proteina', '- GROWTH SUPPLEMENTS - WHEY PROTEIN CONCENTRADO 900G', 96.00, 1),
('proteina', '- Max Titanium-Whey Protein 900g-', 142.00, 1),
('proteina', '- Max Titanium-Whey Protein Concentrado (900g)-', 132.00, 1),
('proteina', '- Max Titanium-Whey Protein Concentrado (900g)- Isolado-', 139.00, 1),
('proteina', '- Max Titanium-Whey Protein Concentrado 900g-', 137.00, 1),
('proteina', '- Integralmedica-Whey Protein 900g-', 128.00, 1),
('proteina', '- Integralmedica-Whey Protein Concentrado 1kg-', 178.00, 1),
('proteina', '- Integralmedica-Whey Protein Isolado 1kg-', 199.99, 1);
-- Produtos Growth - Termogênicos
INSERT INTO produtos (categoria, nome, preco, quantidade) VALUES
('termogenicos', '- Growth Supplements-HOT Termogênico (60 Comprimidos) -', 37.80, 1),
('termogenicos', '- Growth Supplements-Óleo de Cártamo + Coco + Chia + Cromo + Vit. E (75 caps) -', 27.00, 1),
('termogenicos', '- Growth Supplements-L-Carnitina Líquida 2000 - 420ml -', 42.30, 1),
('termogenicos', '- Growth Supplements-Gengibre em pó 250gr -', 21.60, 1),
('termogenicos', '- Max Titanium-Shot Dry 150g -', 98.56, 1),
('termogenicos', '- Max Titanium-2Hot 200G -', 87.18, 1),
('termogenicos', '- Max Titanium-Fire Black 60 Caps-', 34.87, 1),
('termogenicos', '- Max Titanium-Shot Thermo Max 60 Cáps-', 69.84, 1),
('termogenicos', '- Max Titanium-L Carnitina 60 Caps-', 90.94, 1),
('termogenicos', '- Max Titanium-Fire White 60 Caps-', 29.88, 1),
('termogenicos', '- Max Titanium-L-Carnitine Pure 400Ml-', 83.39, 1),
('termogenicos', '- Integralmedica-Therma Pro Hardcore-', 47.92, 1),
('termogenicos', '- Integralmedica-Lipo Dry-', 107.91, 1),
('termogenicos', '- Integralmedica-H2OUT - DIURETIC-', 78.21, 1);

-- Produtos Growth - Vitaminas

INSERT INTO produtos (categoria, nome, preco, quantidade) VALUES
('vitaminas', '- Growth Supplements-Multivitamínico (120 cáps) (nova fórmula)- ', 36.90, 1),
('vitaminas', '- Growth Supplements-Óleo de Peixe Ultra (75 softgel) - ', 42.30, 1),
('vitaminas', '- Growth Supplements-Vitamina D ULTRA (2000UI) 120 caps  - ', 27.00, 1),
('vitaminas', '- Growth Supplements-Vitamina B12 com 120 cápsulas -', 19.80, 1),
('vitaminas', '- Growth Supplements-Cloreto de Magnésio 120 comp -', 18.00, 1),
('vitaminas', '- Growth Supplements-Coenzima Q10 -', 31.50, 1),
('vitaminas', '- Growth Supplements- Vitamina C (120 caps)-', 14.40, 1),
('vitaminas', '- Growth Supplements-ZMA (120 caps)-', 22.68, 1),
('vitaminas', '- Growth Supplements-Vitamina C + Zinco Efervescente Tubete c/ 10 Tabs -', 7.20, 1),
('vitaminas', '- Growth Supplements-Polivitamínico Mastigável 120Comp -', 23.40, 1),
('vitaminas', '- Growth Supplements-Vitamina K2 60 Cápsulas -', 19.80, 1),
('vitaminas', '- Growth Supplements-NAC (N-ACETIL L-CISTEÍNA) 60CAPS-', 36.00, 1),
('vitaminas', '- Growth Supplements-Growth Skin 345g (Colágeno tipo 1 + Colágeno VERISOL® + Ácido Hialurônico + Vitamina C) -', 88.20, 1),
('vitaminas', '- Growth Supplements-Vitamina D (75 cápsulas)-', 13.50, 1),
('vitaminas', '- Growth Supplements-Óleo de Cártamo + Coco + Chia + Cromo + Vit. E (75 caps) -', 27.00, 1),
('vitaminas', '- Growth Supplements-Cálcio + Vitamina D + Vitamina K - 120 comp -', 63.00, 1),
('vitaminas', '- Growth Supplements-Picolinato de Cromo 120caps-', 18.00, 1),
('vitaminas', '- Growth Supplements-HAIR SKIN GUMMY 30UN-', 36.00, 1),
('vitaminas', '- Growth Supplements-Vitamina E (75caps)-', 13.50, 1),
('vitaminas', '- Max Titanium-Omega 3 90 Caps-', 56.85, 1),
('vitaminas', '- Max Titanium-Multimax Complex 90 Caps-', 56.85, 1),
('vitaminas', '- Max Titanium- Vitamina D3 60 Caps', 60.62, 1),
('vitaminas', '- Max Titanium- Vitamina C 500Mg-', 48.40, 1),
('vitaminas', '- Max Titanium- CA - Óleo de Cártamo 120 Caps-', 63.85, 1),
('vitaminas', '- Integralmedica-ZMA Testo Booster-', 39.92, 1),
('vitaminas', '- Integralmedica- VitaPure Super-', 72.12, 1),
('vitaminas', '- Integralmedica- 4 Sleep Night Time Recovery-', 53.32, 1),
('vitaminas', '- Integralmedica- Reforz- C Immunity-', 90.12, 1);
