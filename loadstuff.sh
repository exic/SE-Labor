eval $(ssh-agent)
ssh-add /pfad/zu/schluessel/id_rsa
ssh git@github.com

# run this in background to get the tunnel
ssh login -L 4446:github.com:22 -N

# test ob login funktioniert
ssh -p 4446 githubusername@localhost

if [ ! -d Labor-SE ]; then
	git clone ssh://git@localhost:4446/exic/Labor-SE.git
fi

cd Labor-SE
git pull origin master
