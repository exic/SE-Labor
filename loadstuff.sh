eval $(ssh-agent)
ssh-add /pfad/zu/schluessel/id_rsa
ssh git@github.com
ssh login -L 4446:github.com:22

# test ob login funktioniert
ssh -p 4446 githubusername@localhost

if [ ! -d Labor-SE ]; then
	git clone ssh://git@localhost:4446/exic/Labor-SE.git
fi

cd Labor-SE
git pull origin master
