PGDMP     .                    x            db_hesco    12.2    12.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    40984    db_hesco    DATABASE     �   CREATE DATABASE db_hesco WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United Kingdom.1252' LC_CTYPE = 'English_United Kingdom.1252';
    DROP DATABASE db_hesco;
                postgres    false            �            1259    57412    obat    TABLE     �   CREATE TABLE public.obat (
    kd_obat character varying(13) NOT NULL,
    merk character varying(20),
    tanggal_kadaluarsa date,
    jenis_obat character varying(15),
    stok_obat character varying(3),
    ket_obat text
);
    DROP TABLE public.obat;
       public         heap    postgres    false            �            1259    65582    pasien    TABLE     �   CREATE TABLE public.pasien (
    nis integer NOT NULL,
    nama character varying(50),
    kelas character varying(10),
    jenkel character varying(5),
    ket_sakit character varying(100),
    tanggal date,
    email character varying(100)
);
    DROP TABLE public.pasien;
       public         heap    postgres    false            �            1259    57404    petugas    TABLE     �   CREATE TABLE public.petugas (
    username character varying(13) NOT NULL,
    nama character varying(35),
    kelas character varying(10),
    password text NOT NULL,
    no_hp character varying(13)
);
    DROP TABLE public.petugas;
       public         heap    postgres    false                      0    57412    obat 
   TABLE DATA           b   COPY public.obat (kd_obat, merk, tanggal_kadaluarsa, jenis_obat, stok_obat, ket_obat) FROM stdin;
    public          postgres    false    203   �                 0    65582    pasien 
   TABLE DATA           U   COPY public.pasien (nis, nama, kelas, jenkel, ket_sakit, tanggal, email) FROM stdin;
    public          postgres    false    204   _                 0    57404    petugas 
   TABLE DATA           I   COPY public.petugas (username, nama, kelas, password, no_hp) FROM stdin;
    public          postgres    false    202   �       �
           2606    57419    obat obat_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.obat
    ADD CONSTRAINT obat_pkey PRIMARY KEY (kd_obat);
 8   ALTER TABLE ONLY public.obat DROP CONSTRAINT obat_pkey;
       public            postgres    false    203            �
           2606    65586    pasien pasien_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.pasien
    ADD CONSTRAINT pasien_pkey PRIMARY KEY (nis);
 <   ALTER TABLE ONLY public.pasien DROP CONSTRAINT pasien_pkey;
       public            postgres    false    204            �
           2606    57411    petugas petugas_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.petugas
    ADD CONSTRAINT petugas_pkey PRIMARY KEY (username);
 >   ALTER TABLE ONLY public.petugas DROP CONSTRAINT petugas_pkey;
       public            postgres    false    202               d   x�e�;
�0 �99E/PI�h]��8�D�h?������09�]���n	���cK%T�顄n��YT�9�~�Hvseh�cSC���Ė�?N�c���$         �   x�M�A
�0��ur�\ !��]7�
�n�Fӡ�Foo�
���=XB��W V޿0�j#c�V��Ltb}fd�,��vV�'��3����c�N>������
{#Lj��XF�G��@���-~���c�4�ˇ�,�FJ���1�         �   x�U��
�0Dϻ_�(M�Mӣ�Q^V#%���Rſ�i,�evgy�l�͋�-������Z%\ؙ�U��=H4i*�֔�K�w��5�	���{}3=Ǆ�R�R�l�?���n�1�EF�(r!
�O�+Q'NHJ����R���]Q',�Ԉ⵽�o�|�g�O����y����LK     