/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.Pod;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PodImpl extends MinimalEObjectImpl.Container implements Pod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.POD;
	}

} //PodImpl
