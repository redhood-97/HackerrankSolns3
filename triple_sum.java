
static long triplets(int[] a, int[] b, int[] c) {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int[] aa=new int[a.length];
        int[] bb=new int[b.length];
        int[] cc=new int[c.length];
        int l=0,m=0,v=0;
        long count=0;
        /* removing all the array duplications */
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i] != a[i+1])
                aa[l++]=a[i];
        }
        aa[l++]=a[a.length-1];
        for(int i=0; i<b.length-1; i++)
        {
            if(b[i] != b[i+1])
                bb[m++]=b[i];
        }
        bb[m++] = b[b.length-1];
        for(int i=0; i<c.length-1; i++)
        {
            if(c[i] != c[i+1])
                cc[v++]=c[i];
        }
        cc[v++] = c[c.length-1];
        long p,r;
        for(int i=0; i<m; i++)
        {   
            p=0;r=0;
            for(int j=0; j<l; j++)
            {
                if(bb[i] >= aa[j])
                    p++;
                else 
                    break;
            }
            for(int k = 0; k<v; k++)
            {
                if(bb[i] >= cc[k])
                    r++;
                else
                    break;
            }
            count += p*r;
        }
        return count;
    }
