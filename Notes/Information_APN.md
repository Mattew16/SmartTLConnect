##Whats an APN?
> Used in Multimedia Messaging Service (MMS)


An Access Point Name (APN) is the name of a gateway between a GPRS, 3G or 4G mobile network and another computer network, frequently the public Internet.

A mobile device making a data connection must be configured with an APN to present to the carrier. The carrier will then examine this identifier to determine what type of network connection should be created, for example: which IP addresses should be assigned to the wireless device, which security methods should be used, and how or if, it should be connected to some private customer network.[1]

More specifically, the APN identifies the packet data network (PDN) that a mobile data user wants to communicate with. In addition to identifying a PDN, an APN may also be used to define the type of service, (e.g. connection to Wireless Application Protocol (WAP) server, Multimedia Messaging Service (MMS)) that is provided by the PDN. APN is used in 3GPP data access networks, e.g. General Packet Radio Service (GPRS), evolved packet core (EPC)..

##Advantages?
The big advantage is that when you use a private APN, the VPN tunnel is configured between the APN gateway and your VPN gateway. That takes away the battery problem you can encounter with traditionnal VPN deployments.

That’s the basic configuration offered by your provider. Usualy you can deploy more secured and scalable architecture, with redundancy, MPLS links if you have one etc… These APNs are usualy RADIUS compatible so you can, on your side, restrict access to your network only to devices registered in your fleet.

##Disadvantages? 
There are three main disadvantages using APN :

   * First, the price. The rent is starting around 900 euros/month in France for a no-failover, simple configuration.
   * You need to rent an APN in each country where you want to deploy your fleet.
   * All your 3G data traffic is going to be redirected on your own network, in and out, so you need to make sure that your infrastructure can support this traffic growth.

##Options

[Vodafone M2M][1]

[NOS M2M][2]

[PT Empresas M2M][3]

[Oni Telecom][4]





[1]:https://ajuda.vodafone.pt/system/selfservice.controller?CONFIGURATION=2354&PARTITION_ID=1&USERTYPE=1&LANGUAGE=pt&COUNTRY=pt&CMD=BROWSE_TOPIC&TOPIC_ID=115355&LEFT_NAV_ID=115377&MODE=NONJS&moreDisplay=999&ARTICLE_ID=1634598&requestedPage=SERVICE

[2]:http://www.nos.pt/empresas/corporate/solucoes-empresariais/maquinas/Pages/planos-modulares.aspx

[3]:https://www.ptempresas.pt/corporate/solucoes-de-negocio/eficiencia-operacional-e-ti/m2m

[4]:http://www.oni.pt/pt-pt/PrivateNetworks)