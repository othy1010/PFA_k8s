/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Affinity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.NodeAffinity#getRequiredDuringSchedulingIgnoredDuringExecution <em>Required During Scheduling Ignored During Execution</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getNodeAffinity()
 * @model
 * @generated
 */
public interface NodeAffinity extends EObject {
	/**
	 * Returns the value of the '<em><b>Required During Scheduling Ignored During Execution</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.NodeSelector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required During Scheduling Ignored During Execution</em>' containment reference list.
	 * @see k8s.K8sPackage#getNodeAffinity_RequiredDuringSchedulingIgnoredDuringExecution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NodeSelector> getRequiredDuringSchedulingIgnoredDuringExecution();

} // NodeAffinity
